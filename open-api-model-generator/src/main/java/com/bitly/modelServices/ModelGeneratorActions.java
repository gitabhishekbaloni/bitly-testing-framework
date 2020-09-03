package com.bitly.modelServices;


import com.bitly.utilities.JsonSerializer;

import java.lang.reflect.Constructor;

public class ModelGeneratorActions {

    private JsonSerializer jsonSerializer;

    public ModelGeneratorActions(JsonSerializer jsonSerializer) {
        this.jsonSerializer = jsonSerializer;
    }

    public String generateDefaultJson(String packageName, String modelName) {
        try {
            Class loaded = getModelClass(packageName, modelName);
            Constructor constructor = loaded.getConstructor();
            return jsonSerializer.serialize(constructor.newInstance());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public <T> Class<T> getModelClass(String packageName, String modelName) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        String classLocation = packageName + "." + modelName;
        try {
            return (Class<T>) classLoader.loadClass(classLocation);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
