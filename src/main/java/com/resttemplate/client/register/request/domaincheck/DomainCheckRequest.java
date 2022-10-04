package com.resttemplate.client.register.request.domaincheck;

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
public class DomainCheckRequest {
    private String sld;
    private Extensions extensions;
    private CheckOptions checkOptions;
    private DirectRights directRights;
}
