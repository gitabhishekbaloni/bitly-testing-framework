package com.bitly.bdd.classess;

import com.bitly.constants.JsonFieldType;
import com.bitly.constants.JsonModelAction;
import lombok.Getter;
import lombok.Setter;

public class JsonModelCreationInput {

    @Getter
    @Setter
    private String alias;

    @Getter
    @Setter
    private String modelFamily;

    @Getter
    @Setter
    private String modelClassName;

    @Getter
    @Setter
    private JsonModelAction jsonModelAction;

    @Getter
    @Setter
    private String jsonPath;

    @Getter
    @Setter
    private String value;

    @Getter
    @Setter
    private JsonFieldType jsonFieldTYpe;

    public JsonModelCreationInput(){}

}
