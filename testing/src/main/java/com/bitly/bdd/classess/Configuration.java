package com.bitly.bdd.classess;

import com.bitly.rest.BaseRestConfiguration;
import com.bitly.rest.BasicRestConfigurationImpl;
import com.bitly.utilities.ResponseTransformer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@org.springframework.context.annotation.Configuration
@PropertySource("classpath:application.properties")
public class Configuration {

    @Getter
    @Value("${url}")
    private String url;

    @Getter
    @Value("${client_id}")
    private String client_id;

    @Getter
    @Value("${client_secret}")
    private String client_secret;

    @Getter
    @Value("${api_auth_header}")
    private String api_auth_header;

    @Getter
    @Value("${access_token}")
    private String access_token;

    @Getter
    @Value("${is_access_token_available}")
    private Boolean is_access_token_available;

    @Getter
    @Value("${url_version}")
    private String url_version;

    @Autowired
    @Getter
    private ApiPaths apiPaths;
}
