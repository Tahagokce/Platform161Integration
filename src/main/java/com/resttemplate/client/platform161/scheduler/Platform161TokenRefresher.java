package com.resttemplate.client.platform161.scheduler;


import com.resttemplate.client.platform161.Platform161Service;
import com.resttemplate.client.platform161.request.usertoken.GetUserTokenRequest;
import com.resttemplate.client.platform161.response.usertoken.GetUserTokenResponse;
import com.resttemplate.client.platform161.store.TokenStore;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
@EnableScheduling
public class Platform161TokenRefresher {
    private final RestTemplate restTemplate;

    /**
     * execute every 45 minutes
     */

    @Scheduled(fixedRate = 45*60000)
    public void refreshToken () {

        GetUserTokenRequest request = new GetUserTokenRequest(
                "****","****"
        );
        GetUserTokenResponse getUserTokenResponse = this.restTemplate.postForObject(
                "******/api/v3/***/tokens"
                ,request
                ,GetUserTokenResponse.class);

        TokenStore.setAccessToken(getUserTokenResponse.getAccessToken());


    }
}
