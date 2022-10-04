package com.resttemplate.client.platform161.response.creatives;


import com.resttemplate.client.platform161.models.ResponseLinks;
import com.resttemplate.client.platform161.models.ResponseMeta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreativesResponse {

    private List<ResponseData> data;

    private ResponseMeta meta;

    private ResponseLinks links;
}
