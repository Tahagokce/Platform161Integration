package com.resttemplate.client.platform161.store;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;


@UtilityClass
public class TokenStore {
    private static String ACCESS_TOKEN = "";

    public static String getAccessToken() {
        return ACCESS_TOKEN;
    }

    public static void setAccessToken(String accessToken) {

        ACCESS_TOKEN = accessToken;
    }
}
