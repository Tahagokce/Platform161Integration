package com.resttemplate.client.platform161.response.updateCustomer;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseContact {

    private String createdBy;

    private long createdDate;

    private String lastModifiedBy;

    private long lastModifiedDate;

    private long id ;

    private String firstName;

    private String lastName;

    private String ldapUserName;

    private String principalId;

}
