package com.bitly.utilities;


import com.bitly.http.ExtractedHeader;
import com.bitly.http.ExtractedResponse;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import java.util.List;
import java.util.stream.Collectors;

public class ResponseTransformer {

    private final JsonSerializer jsonSerializer;
    private final ModelValidator modelValidator;

    public  ResponseTransformer(JsonSerializer jsonSerializer,ModelValidator modelValidator){
        this.jsonSerializer = jsonSerializer;
        this.modelValidator = modelValidator;
    }

    public ExtractedResponse transform(Response response){
        int statusCode = response.statusCode();
        List<ExtractedHeader> headers = extractHeaders(response.headers());
        String body = response.getBody().print();
        return new ExtractedResponse(statusCode, headers, body, jsonSerializer, modelValidator);
    }

    private List<ExtractedHeader> extractHeaders(Headers headers){
        return headers.asList().stream().map(h -> new ExtractedHeader(h.getName(), h.getValue())).collect(Collectors.toList());
    }
}
