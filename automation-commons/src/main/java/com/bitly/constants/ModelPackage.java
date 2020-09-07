package com.bitly.constants;


import lombok.Getter;

public enum ModelPackage {
    BITLY_V4("com.bitly.model.V4", "api.json","v4");

    @Getter
    private String packagePath;
    private String specPath;
    private String envPathPrefix;

    ModelPackage(String packagePath, String specPath,String envPathPrefix){
        this.packagePath = packagePath;
        this.specPath = specPath;
        this.envPathPrefix = envPathPrefix;
    }

}
