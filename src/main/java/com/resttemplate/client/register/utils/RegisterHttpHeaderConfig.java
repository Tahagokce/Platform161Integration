package com.resttemplate.client.register.utils;

import lombok.experimental.UtilityClass;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@UtilityClass
public class RegisterHttpHeaderConfig {

    public static HttpHeaders prepareHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_XML);
        return httpHeaders;
    }

}
