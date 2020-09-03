package com.bitly.modelServices;

import com.bitly.constants.JsonFieldType;
import com.bitly.constants.JsonModelAction;
import com.google.gson.Gson;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;


public class JsonModificationActions {

    public Object applyModification(String json, JsonModelAction action, String jsonPath, String value, JsonFieldType fieldType) {
        Object modified = null;
        DocumentContext documentContext = JsonPath.parse(json);
        if (null != action) {
            Object val = resolveField(fieldType, value);

            try {
                documentContext.read(jsonPath);
            } catch (PathNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            switch (action) {
                case MODIFY:
                    modified = documentContext.set(jsonPath, val).json();
                    break;
                    //can add remove based upon requirements
//                case REMOVE:
//                    modified = documentContext.delete(jsonPath).json();
//                    break;
            }
        } else {
            modified = documentContext.json();
        }
        return modified;
    }

    private Object resolveField(JsonFieldType fieldType, String value){
        Object resolved;
        if(fieldType == JsonFieldType.JSON){
            Gson gson = new Gson();
            resolved = gson.fromJson(value, Object.class);
        }else {
            resolved = value;
        }
        return  resolved;
    }
}
