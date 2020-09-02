package com.bitly.http;

import lombok.Getter;
import lombok.Setter;

public class ExtractedHeader {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String value;

    public  ExtractedHeader(String name, String value){
        this.name = name;
        this.value=value;

    }
}
