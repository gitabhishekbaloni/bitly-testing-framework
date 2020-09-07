package com.bitly.dependencies;

import com.bitly.utilities.JsonSerializer;
import com.bitly.utilities.ModelValidator;
import com.bitly.utilities.ResponseTransformer;
import org.springframework.context.annotation.Bean;

public class ContainerUtilities {
    @Bean
    public JsonSerializer getJsonSerializer() {
        return new JsonSerializer();
    }

    @Bean
    public ModelValidator getModelValidator(JsonSerializer jsonSerializer) {
        return new ModelValidator(jsonSerializer);
    }

    @Bean
    public ResponseTransformer getResponseTransformer(JsonSerializer jsonSerializer, ModelValidator modelValidator) {
        return new ResponseTransformer(jsonSerializer,modelValidator);
    }
}
