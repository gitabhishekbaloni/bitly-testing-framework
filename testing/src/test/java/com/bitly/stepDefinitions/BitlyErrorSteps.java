package com.bitly.stepDefinitions;

import com.bitly.bdd.classess.BitlyClient;
import com.bitly.constants.Constants;
import com.bitly.http.ExtractedResponse;
import cucumber.api.java8.En;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class BitlyErrorSteps extends BitlyBaseSteps implements En {


    @Autowired
    public BitlyClient bitlyClient;

    public BitlyErrorSteps() {

        Given("I have lost my access", () -> {
            scenarioContext.setContext(Constants.ACCESS_TOKEN, Constants.EMPTY_STRING);
        });

        And("^receives valid response with message \"([^\"]*)\" at \"([^\"]*)\"$", (String error_message,String jsonPathOfErrorMessage) -> {
            Object value = getNodeValue(scenarioContext.getLastResponse().getBody(), jsonPathOfErrorMessage);
            assertThat(value, notNullValue());
            assertThat(value.toString(), equalTo(error_message));
        });

        When("^try creating bitlink as \"([^\"]*)\" for payload \"([^\"]*)\" on url \"([^\"]*)\"$", (String newBitLink, String bitlyPayload, String url) -> {
            ExtractedResponse lastSuccessfulCreatedResponse = bitlyClient.createBitlyLinks(serialiser.serialize(scenarioContext.getContext(bitlyPayload)),
                    scenarioContext.getContext(Constants.ACCESS_TOKEN).toString(),url);
            scenarioContext.setContext(newBitLink, lastSuccessfulCreatedResponse);
            scenarioContext.setLastResponse(lastSuccessfulCreatedResponse);
        });

    }
}
