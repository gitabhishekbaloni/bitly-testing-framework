package com.bitly.dependencies;

import com.bitly.modelServices.JsonModificationActions;
import com.bitly.modelServices.ModelGeneratorActions;
import com.bitly.utilities.JsonSerializer;
import org.springframework.context.annotation.Bean;


public class ContainerModel {
    @Bean
    public JsonModificationActions getJsonModificationAction() {
        return new JsonModificationActions();
    }

    @Bean
    public ModelGeneratorActions getModelGeneratorActions(JsonSerializer jsonSerializer) {
        return new ModelGeneratorActions(jsonSerializer);
    }

}