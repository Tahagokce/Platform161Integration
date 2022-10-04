package com.resttemplate.client.platform161.response.campaigns;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseData {

    private String id;

    private String type;

    private ResponseAttributes attributes;

    private ResponseRelationships relationships;

}
