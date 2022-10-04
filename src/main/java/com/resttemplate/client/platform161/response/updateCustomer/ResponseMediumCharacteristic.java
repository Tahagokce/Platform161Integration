package com.resttemplate.client.platform161.response.updateCustomer;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseMediumCharacteristic {

    private String createdBy;

    private long createdDate;

    private String lastModifiedBy;

    private long lastModifiedDate;

    private String city;

    private String country;

    private String emailAddress;

    private String type;

    private String number;

    private String postcode;

    private String stateOrProvince;

    private String streetOne;

    private String streetTwo;

    private long id;

    private String principalId;
}