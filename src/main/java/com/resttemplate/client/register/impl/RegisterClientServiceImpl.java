package com.resttemplate.client.register.impl;

import com.resttemplate.client.register.RegisterClientService;
import com.resttemplate.client.register.request.RegisterBaseRequest;
import com.resttemplate.client.register.request.domainadd.DomainAddRequest;
import com.resttemplate.client.register.request.domaincheck.DomainCheckRequest;
import com.resttemplate.client.register.request.useradd.UserAddRequest;
import com.resttemplate.client.register.response.domaincheck.RegisterBaseResponse;
import com.resttemplate.client.register.utils.RegisterHttpHeaderConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RegisterClientServiceImpl implements RegisterClientService {
    private final RestTemplate restTemplate;


    @Override
    public RegisterBaseResponse domainCheck(RegisterBaseRequest domainCheckRequest) {
        HttpHeaders httpHeaders = RegisterHttpHeaderConfig.prepareHeaders();

        HttpEntity<RegisterBaseRequest> request = new HttpEntity<>(domainCheckRequest, httpHeaders);

        ResponseEntity<RegisterBaseResponse> response = restTemplate.postForEntity("http://localhost:8080/xml/availability", request, RegisterBaseResponse.class);


        return response.getBody();
    }

    @Override
    public String userAdd(RegisterBaseRequest userAddRequest) {
        HttpHeaders httpHeaders = RegisterHttpHeaderConfig.prepareHeaders();

        HttpEntity<RegisterBaseRequest> request = new HttpEntity<>(userAddRequest, httpHeaders);

        ResponseEntity<String> response = restTemplate.postForEntity("https://staging-services.rxportalexpress.com/V1.0/", request, String.class);


        return response.getBody();

    }

    @Override
    public String domainAdd(RegisterBaseRequest domainAddRequest) {
        HttpHeaders httpHeaders = RegisterHttpHeaderConfig.prepareHeaders();

        HttpEntity<RegisterBaseRequest> request = new HttpEntity<>(domainAddRequest, httpHeaders);

        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8080/xml/availability", request, String.class);


        return response.getBody();
    }
}
