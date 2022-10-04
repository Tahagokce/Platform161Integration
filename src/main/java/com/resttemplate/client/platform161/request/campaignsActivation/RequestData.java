package com.resttemplate.client.platform161.request.campaignsActivation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestData {

    public String type;

    public String id;

    public RequestAttributes attributes;

}
