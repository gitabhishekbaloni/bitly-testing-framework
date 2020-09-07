package com.bitly.rest;

import com.bitly.http.ExtractedResponse;
import com.bitly.utilities.ResponseTransformer;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static io.restassured.RestAssured.given;


public abstract class BasicRestConfigurationImpl implements BaseRestConfiguration {
    private static final Logger LOG = LoggerFactory.getLogger(BasicRestConfigurationImpl.class);

    @Getter
    @Setter
    private ResponseTransformer transformer;

    @Getter
    @Setter
    private String url;

    protected BasicRestConfigurationImpl(ResponseTransformer transformer, String url) {
        this.transformer = transformer;
        this.url = url;
    }

    protected ExtractedResponse sendGet(String url, Map<String, String> headers) {
        Response response = null;
        headers.put("Accept", "application/json");
        try {
            response = given().
                    spec(setUpRequestSpecifications(headers)).contentType("application/json").config(RestAssured.config().encoderConfig(RestAssured.config().getEncoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                    .when().log().all()
                    .get(url).prettyPeek()
                    .then()
                    .extract()
                    .response();
        } catch (Exception ex) {
            LOG.error("Rest call failed", ex.toString());
            throw new RuntimeException(ex);
        }
        return transformer.transform(response);
    }

    protected ExtractedResponse sendGet(String url, Map<String, String> headers, Map<String, ?> pathParams) {
        Response response = null;
        headers.put("Accept", "application/json");
        try {
            response = given().
                    spec(setUpRequestSpecifications(headers)).contentType("application/json").config(RestAssured.config().encoderConfig(RestAssured.config().getEncoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                    .pathParams(pathParams)
                    .when().log().all()
                    .get(url).prettyPeek()
                    .then()
                    .extract()
                    .response();
        } catch (Exception ex) {
            LOG.error("Rest call failed", ex.toString());
            throw new RuntimeException(ex);
        }
        return transformer.transform(response);
    }

    protected ExtractedResponse sendGet(String url, Map<String, String> headers, Map<String, ?> pathParams, Map<String, ?> queryParams) {
        Response response = null;
        headers.put("Accept", "application/json");
        try {
            response = given().queryParams(queryParams)
                    .spec(setUpRequestSpecifications(headers)).contentType("application/json").config(RestAssured.config().encoderConfig(RestAssured.config().getEncoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                    .pathParams(pathParams)
                    .when().log().all()
                    .get(url).prettyPeek()
                    .then()
                    .extract()
                    .response();
        } catch (Exception ex) {
            LOG.error("Rest call failed", ex.toString());
            throw new RuntimeException(ex);
        }
        return transformer.transform(response);
    }


    protected RequestSpecification setUpRequestSpecifications(Map<String, String> headers, String specifiedContentType) {
        return new RequestSpecBuilder().setBaseUri(getUrl()).setContentType(specifiedContentType).addHeaders(headers).build();
    }

    protected RequestSpecification setUpRequestSpecifications(Map<String, String> headers) {
        return new RequestSpecBuilder().setBaseUri(getUrl()).addHeaders(headers).build();
    }


    protected ExtractedResponse sendPost(String url, Object payload, Map<String, String> headers) {
        Response response = null;
        headers.put("Accept", "application/json");
        headers.put("Content-Type","application/json");
       try {

            response = given()
                    .spec(setUpRequestSpecifications(headers)).config(RestAssured.config().encoderConfig(RestAssured.config().getEncoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                    .body(payload)
                    .when().log().all()
                    .post(url)
                    .then()
                    .extract()
                    .response().prettyPeek();
        } catch (Exception ex) {
            LOG.error("Rest call failed", ex.toString());
            throw new RuntimeException(ex);
        }
        return transformer.transform(response);
    }

    protected ExtractedResponse sendPost(String url, Map<String, String> headers) {
        Response response = null;
        try {
            response = given().
                    spec(setUpRequestSpecifications(headers, "application/x-www-form-urlencoded"))
                    .when().log().all()
                    .post(url).prettyPeek()
                    .then()
                    .extract()
                    .response();
        } catch (Exception ex) {
            LOG.error("Rest call failed", ex.toString());
            throw new RuntimeException(ex);
        }
        return transformer.transform(response);
    }
}
