package com.resttemplate.client.platform161.response.updateCustomer;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseParentFirm {

    private String createdBy;

    private long createdDate;

    private String lastModifiedBy;

    private long lastModifiedDate;

    private long idfirm;

    private String name;

    private String parentFirm;

    private long firmIdentity;

}