package com.bitly.utilities;


import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.IGNORING_VALUES;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;


public class ModelValidator {
    private static final Logger Logger = LoggerFactory.getLogger(ModelValidator.class);

    private final JsonSerializer jsonSerializer;

    @Autowired
    public ModelValidator(JsonSerializer jsonSerializer) {
        this.jsonSerializer = jsonSerializer;
    }

    //TODO: required field validation can be added based upon requirements.
    //This will check json schema
    public <T> void validate(Class<T> modelClass, T model, String body, boolean fieldValidation) {
        Assert.notNull(model);
        assertThatJson(jsonSerializer.serialize(model)).when(IGNORING_VALUES).when(TREATING_NULL_AS_ABSENT).isEqualTo(body);
    }

}

