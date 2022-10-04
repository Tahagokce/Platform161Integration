package com.resttemplate.client.platform161.response.updateCustomer;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UpdateCustomerResponse {

    private String createdBy;

    private long createdDate;

    private String lastModifiedBy;

    private long lastModifiedDate;

    private long id ;

    private String firstName;

    private String lastName;

    private String nationalId;

    private String status;

    private String companyName;

    private String taxNumber;

    private String taxOffice;

    private String countryCode;

    private String birthDate;

    private ResponsePartyType partyType;

    private List<ResponseCharacteristic> characteristic;

    private List<ResponseContactMedium> contactMedium;

    private String relatedParty;

    private List<Object> permissions;

    private ResponseFirm firm;

    private long firmIdentity;

    private List<ResponseAgreements> agreements;

    private String principalId;

}
