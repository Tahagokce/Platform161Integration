package com.resttemplate.client.register.response.domaincheck;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ServiceResponse {
    private String command;
    private String clientRef;
    private StatusResponse status;
    private DomainCheckResponse response;
    private Statistics statistics;
}
