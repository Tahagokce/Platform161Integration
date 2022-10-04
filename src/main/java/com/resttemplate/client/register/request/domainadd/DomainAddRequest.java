package com.resttemplate.client.register.request.domainadd;

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
public class DomainAddRequest {
    private String userID;
    private String domainName;
    private String term;
    private DomainAddContacts contacts;
}
