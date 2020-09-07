package com.bitly.stepDefinitions;

import com.bitly.bdd.classess.JsonModelCreationInput;
import com.bitly.bdd.classess.ScenarioContext;
import com.bitly.constants.Constants;
import com.bitly.constants.JsonFieldType;
import com.bitly.constants.JsonModelAction;
import com.bitly.constants.ModelPackage;
import com.bitly.modelServices.JsonModificationActions;
import com.bitly.modelServices.ModelGeneratorActions;
import com.bitly.utilities.JsonSerializer;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import io.cucumber.datatable.DataTable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BitlyBaseSteps {

    @Autowired
    protected ScenarioContext scenarioContext;

    @Autowired
    protected ModelGeneratorActions modelActions;

    @Autowired
    protected JsonModificationActions modificationActions;

    @Autowired
    protected JsonSerializer serialiser;

    protected <T> List<T> dataTableAsList(Class<T> clazz, DataTable givenData) {
        return givenData.asList(clazz);
    }

    protected <T> Class<T> getModalClass(JsonModelCreationInput input) {
        return modelActions.getModelClass(ModelPackage.valueOf(input.getModelFamily()).getPackagePath(),input.getModelClassName());
    }

    protected void generateModels(final List<JsonModelCreationInput> modelModificationInputs) {
        modelModificationInputs.forEach(input ->{
            String defaultJson;
            if(scenarioContext.hasKey(input.getAlias())){
                defaultJson = serialiser.serialize(scenarioContext.getContext(input.getAlias()));
            }else{
                defaultJson = modelActions.generateDefaultJson(ModelPackage.valueOf(input.getModelFamily()).getPackagePath(),input.getModelClassName());
                scenarioContext.setContext(input.getAlias(),defaultJson);
            }
            Object modifiedObject = modificationActions.applyModification(defaultJson,JsonModelAction.valueOf(input.getJsonModelAction().toString()),input.getJsonPath(), input.getValue(),JsonFieldType.valueOf(input.getJsonFieldTYpe().toString()));
            scenarioContext.setContext(input.getAlias(),modifiedObject);
        });
    }

    protected <T> T getNode(String json, String jsonPath){
        DocumentContext documentContext = JsonPath.parse(json);
        return documentContext.read(jsonPath);
    }
    protected String getNodeValue(String json, String jsonPath){
        Object node = getNode(json, jsonPath);
        return null != node ?node.toString(): "null";
    }

    protected Map<String, String> removeNullOrEmpty(Map<String, String> map){
        map.values().removeAll(Collections.singleton(null));
        map.values().removeAll(Collections.singleton(Constants.EMPTY_STRING));
        return map;
    }


}
