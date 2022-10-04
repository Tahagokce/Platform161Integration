package com.resttemplate.client.register;

import com.resttemplate.client.register.request.RegisterBaseRequest;
import com.resttemplate.client.register.request.domainadd.DomainAddRequest;
import com.resttemplate.client.register.request.domaincheck.DomainCheckRequest;
import com.resttemplate.client.register.request.useradd.UserAddRequest;
import com.resttemplate.client.register.response.domaincheck.RegisterBaseResponse;

public interface RegisterClientService {
    RegisterBaseResponse domainCheck(RegisterBaseRequest domainCheckRequest);
    String userAdd(RegisterBaseRequest userAddRequest);
    String domainAdd(RegisterBaseRequest domainAddRequest);
}
