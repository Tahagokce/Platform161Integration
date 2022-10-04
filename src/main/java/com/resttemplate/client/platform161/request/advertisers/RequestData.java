package com.resttemplate.client.platform161.request.advertisers;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestData {

    private String type ;

    private RequestAttributes attributes;

    private RequestRelationships relationships;

}

