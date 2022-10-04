package com.resttemplate.client.platform161.response.creatives;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData {

    private String id;

    private String type;

    private ResponseAttributes attributes;
}
