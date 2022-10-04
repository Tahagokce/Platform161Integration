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
public class ContactRequest {
    private String title;
    private String firstName;
    private String lastName;
    private String companyName;
    private String companyPositionHeld;
    private String emailAddress;
    private String telephoneNumber;
    private String faxNumber;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String province;
    private String state;
    private String postalCode;
    private String countryCode;
    private String contactType;
}
