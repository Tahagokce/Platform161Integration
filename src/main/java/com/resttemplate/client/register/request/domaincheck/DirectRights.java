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
public class DirectRights {
    private String email;
    private String name;
    private String org;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
}
