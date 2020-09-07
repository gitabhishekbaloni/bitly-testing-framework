package com.bitly.bdd.classess;

import com.bitly.constants.JsonFieldType;
import com.bitly.constants.JsonModelAction;
import lombok.Getter;
import lombok.Setter;

public class SortInput {

    @Getter
    @Setter
    private String unit;

    @Getter
    @Setter
    private String units;

    @Getter
    @Setter
    private String unit_reference;

    @Getter
    @Setter
    private String size;

    public SortInput(){}

}
