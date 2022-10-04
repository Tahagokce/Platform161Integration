package com.resttemplate.client.platform161.response.partialCreativeFiles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData {

    private String id;

    private String type;

    private ResponseAttributes attributes;

    private ResponseRelationships relationships;

}
