package com.bitly.utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonSerializer {

    private static final Logger Logger = LoggerFactory.getLogger(JsonSerializer.class);

    private final  Gson defaultMapper;

    public JsonSerializer(){
        GsonBuilder defaultBuilder = new GsonBuilder();
        defaultMapper = defaultBuilder.serializeNulls().create();
    }

    public  <T> String serialize(T object){
        try {
            return defaultMapper.toJson(object);
        }catch (Exception ex){
            Logger.error("Error happened in serialization", ex);
            throw new RuntimeException(ex);
        }

    }

    public  <T> T deserialize(String json, Class<T> objectType){
        try
        {
        return defaultMapper.fromJson(json, objectType);
        }catch (Exception ex){
            Logger.error("Error happened in de-serialization", ex);
            throw new RuntimeException(ex);
        }
    }
}
