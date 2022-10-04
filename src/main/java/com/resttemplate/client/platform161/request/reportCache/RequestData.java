package com.resttemplate.client.platform161.request.reportCache;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestData {

    private String type;

    private RequestAttributes attributes;
}
