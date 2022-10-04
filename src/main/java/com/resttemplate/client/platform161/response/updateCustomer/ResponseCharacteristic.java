package com.resttemplate.client.platform161.response.updateCustomer;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseCharacteristic {

    private String createdBy;

    private long createdDate;

    private String lastModifiedBy;

    private long lastModifiedDate;

    private String name;

    private String value;

    private long id;

}

