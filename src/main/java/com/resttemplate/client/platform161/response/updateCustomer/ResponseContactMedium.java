package com.resttemplate.client.platform161.response.updateCustomer;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseContactMedium {

    private String createdBy;

    private long createdDate;

    private String lastModifiedBy;

    private long lastModifiedDate;

    private String type;

    private String validFor;

    private ResponseMediumCharacteristic mediumCharacteristic;

    private boolean preferred;

    private long id;

    private ResponseContact contact;

    private String principalId;


}
