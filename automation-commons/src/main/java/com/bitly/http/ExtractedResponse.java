package com.bitly.http;

import com.bitly.utilities.JsonSerializer;
import com.bitly.utilities.ModelValidator;
import lombok.Builder;
import lombok.Getter;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

@Builder
public class ExtractedResponse {

    @Getter
    private int statusCode;

    @Getter
    private List<ExtractedHeader> headers;

    @Getter
    private String body;

    private final JsonSerializer jsonSerializer;
    private final ModelValidator modelValidator;

    public ExtractedResponse(int statusCode, List<ExtractedHeader> headers, String body, JsonSerializer jsonSerializer, ModelValidator modelValidator){

        this.statusCode = statusCode;
        this.headers = headers;
        this.body = body;
        this.jsonSerializer = jsonSerializer;
        this.modelValidator = modelValidator;
    }

    public  ExtractedHeader getHeader(String name){
        Optional<ExtractedHeader> extractedHeader = headers.stream().filter(x-> x.getName().equalsIgnoreCase(name)).findFirst();
        return extractedHeader.orElse(null);
    }

    public <T> T as(Class<T> modelClass) { return  as(modelClass, true); }

    public <T> T as(Class<T> modelClass, boolean validateFields) {
        T model = null;
        return model;
    }

}
