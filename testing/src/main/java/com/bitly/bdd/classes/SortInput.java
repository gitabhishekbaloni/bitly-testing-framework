package com.bitly.bdd.classes;

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

    public SortInput() {
    }

}
