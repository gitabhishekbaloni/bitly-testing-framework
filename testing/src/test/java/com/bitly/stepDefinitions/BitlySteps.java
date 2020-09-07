package com.bitly.stepDefinitions;

import com.bitly.bdd.classess.BitlyClient;
import com.bitly.bdd.classess.JsonModelCreationInput;
import com.bitly.bdd.classess.SortInput;
import com.bitly.constants.Constants;
import com.bitly.http.ExtractedResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.java8.En;
import io.cucumber.datatable.DataTable;
import org.hamcrest.collection.IsMapContaining;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BitlySteps extends BitlyBaseSteps implements En {


    @Autowired
    public BitlyClient bitlyClient;

    public BitlySteps() {

        Given("I am authorised to access bitly api service", () -> {
            assertThat(Constants.ACCESS_TOKEN_NOT_SET, scenarioContext.getContext(Constants.ACCESS_TOKEN), notNullValue());
        });

        Given("I have model data", (DataTable givenData) -> {
            List<JsonModelCreationInput> modelModificationInputs = givenData.asList(JsonModelCreationInput.class);
            generateModels(modelModificationInputs);
        });

        Given("queries for groups", () -> {
            ExtractedResponse lastSuccessfulGroupResponse = bitlyClient.getGroups(scenarioContext.getContext(Constants.ACCESS_TOKEN).toString());
            scenarioContext.setLastResponse(lastSuccessfulGroupResponse);
        });

        When("creates a bitlink as {string} for payload {string}", (String newBitLink, String bitlyPayload) -> {
            ExtractedResponse lastSuccessfulCreatedResponse = bitlyClient.createBitlyLinks(serialiser.serialize(scenarioContext.getContext(bitlyPayload)),
                    scenarioContext.getContext(Constants.ACCESS_TOKEN).toString());
            scenarioContext.setContext(newBitLink, lastSuccessfulCreatedResponse);
            scenarioContext.setLastResponse(lastSuccessfulCreatedResponse);
        });

        Then("receives response with status code \"([^\"]*)\"$", (String statusCode) -> {
            assertThat(scenarioContext.getLastResponse().getStatusCode(), equalTo(Integer.parseInt(statusCode)));
        });

        Then("receives valid response", (DataTable responseData) -> {
            List<JsonModelCreationInput> responseClass = responseData.asList(JsonModelCreationInput.class);
            assertThat(scenarioContext.getLastResponse().as(getModalClass(responseClass.get(0))), notNullValue());
        });

        When("queries for group id \"([^\"]*)\" of first group \"([^\"]*)\"$", (String groupId, String jsonPathOfFirstGroup) -> {
            String body = scenarioContext.getLastResponse().getBody();
            assertThatJson(body).inPath(jsonPathOfFirstGroup).isNotNull();
            scenarioContext.setContext(groupId, getNodeValue(body, jsonPathOfFirstGroup));
            ExtractedResponse responseByGroupId = bitlyClient.getGroupByGroupId(scenarioContext.getContext(groupId).toString(), scenarioContext.getContext(Constants.ACCESS_TOKEN).toString());
            scenarioContext.setLastResponse(responseByGroupId);
        });

        When("queries for group id \"([^\"]*)\"$", (String groupId) -> {
            ExtractedResponse responseByGroupId = bitlyClient.getGroupByGroupId(groupId, scenarioContext.getContext(Constants.ACCESS_TOKEN).toString());
            scenarioContext.setLastResponse(responseByGroupId);
        });

        When("^sort bitlinks using \"([^\"]*)\" for group id \"([^\"]*)\"$", (String sort, String groupId, DataTable responseData) -> {
            ObjectMapper oMapper = new ObjectMapper();
            List<SortInput> sortInputs = responseData.asList(SortInput.class);
            Map<String, String> sortParams = oMapper.convertValue(sortInputs.get(0), Map.class);
            sortParams = removeNullOrEmpty(sortParams);
            ExtractedResponse responseByGroupId = bitlyClient.getSortedBitlinksForGroupId(groupId,
                    sort, sortParams,
                    scenarioContext.getContext(Constants.ACCESS_TOKEN).toString());
            scenarioContext.setLastResponse(responseByGroupId);
        });


        When("^sort bitlinks using \"([^\"]*)\" for group id \"([^\"]*)\" of first group \"([^\"]*)\"$", (String sort, String groupId, String jsonPathOfFirstGroup, DataTable responseData) -> {
            ObjectMapper oMapper = new ObjectMapper();
            List<SortInput> sortInputs = responseData.asList(SortInput.class);
            Map<String, String> sortParams = oMapper.convertValue(sortInputs.get(0),Map.class);
            sortParams = removeNullOrEmpty(sortParams);
            String body = scenarioContext.getLastResponse().getBody();
            assertThatJson(body).inPath(jsonPathOfFirstGroup).isNotNull();
            scenarioContext.setContext(groupId, getNodeValue(body, jsonPathOfFirstGroup));
            ExtractedResponse responseByGroupId = bitlyClient.getSortedBitlinksForGroupId(scenarioContext.getContext(groupId).toString(),
                    sort, sortParams,
                    scenarioContext.getContext(Constants.ACCESS_TOKEN).toString());
            scenarioContext.setLastResponse(responseByGroupId);
        });

        Then("receives response with field value", (DataTable responseData) -> {
            List<JsonModelCreationInput> expectedResponses = responseData.asList(JsonModelCreationInput.class);
            String body = scenarioContext.getLastResponse().getBody();
            Map<String, Boolean> fieldsMap = new HashMap();
            expectedResponses.stream().forEach(expectedResponse -> fieldsMap.put(expectedResponse.getJsonPath(),
                    expectedResponse.getValue().equals(getNodeValue(body, expectedResponse.getJsonPath()))));
            assertThat("Field values are different than response.",fieldsMap, not(IsMapContaining.hasValue(false)));
        });

    }

}

