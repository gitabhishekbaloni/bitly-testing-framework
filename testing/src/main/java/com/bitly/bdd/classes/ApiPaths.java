package com.bitly.bdd.classes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@org.springframework.context.annotation.Configuration
@PropertySource("classpath:application.properties")
@ConfigurationProperties("api_path")
public class ApiPaths {

    @Getter
    @Setter
    private String access_token_path;

    @Getter
    @Setter
    private String create_bitlinks;

    @Getter
    @Setter
    private String get_groups;

    @Getter
    @Setter
    private String get_group_by_group_id;

    @Getter
    @Setter
    private String get_sorted_path;
}
