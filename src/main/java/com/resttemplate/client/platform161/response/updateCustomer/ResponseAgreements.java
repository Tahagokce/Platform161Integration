package com.resttemplate.client.platform161.response.updateCustomer;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseAgreements {

    private String createdBy;

    private long createdDate;

    private String lastModifiedBy;

    private long lastModifiedDate;

    private long id;

    private String description;

    private String value;

    private String status;

    private String principalId;
}
