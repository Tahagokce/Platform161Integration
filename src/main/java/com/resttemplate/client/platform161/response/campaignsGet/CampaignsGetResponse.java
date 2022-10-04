package com.resttemplate.client.platform161.response.campaignsGet;


import com.resttemplate.client.platform161.models.ResponseLinks;
import com.resttemplate.client.platform161.models.ResponseMeta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignsGetResponse {

    private ResponseData data;

    private ResponseMeta meta;

    private ResponseLinks links;
}
