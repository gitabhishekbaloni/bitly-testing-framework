package com.bitly.bdd.classess;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Builder
public class TokenPayload {

    @Getter
    @Setter
    private String client_id;

    @Getter
    @Setter
    private String client_secret;

    @Getter
    @Setter
    private String api_auth_header;
}
