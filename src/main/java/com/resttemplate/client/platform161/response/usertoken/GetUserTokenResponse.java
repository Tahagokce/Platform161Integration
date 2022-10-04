package com.resttemplate.client.platform161.response.usertoken;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GetUserTokenResponse {

    @JsonProperty(value = "access_token")
    private String accessToken;

    @JsonProperty(value = "refresh_token")
    private String refreshToken;

    @JsonProperty(value = "csrf_token")
    private String csrfToken;

}
