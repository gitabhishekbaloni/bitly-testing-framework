package com.bitly.bdd.classess;

import com.bitly.http.ExtractedResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ScenarioContext {

    private Map<String, Object> scenarioContext;

    @Getter
    @Setter
    private ExtractedResponse lastResponse;

    public ScenarioContext(){
        scenarioContext = new HashMap<>();
    }

    public void setContext(String key, Object value) {
        scenarioContext.put(key.toString(), value);
    }

    public Object getContext(String key){
        return scenarioContext.get(key.toString());
    }

    public Set<String> getKeys(){
        return scenarioContext.keySet();
    }

    public Boolean hasKey(String key){
        return scenarioContext.containsKey(key.toString());
    }
}
