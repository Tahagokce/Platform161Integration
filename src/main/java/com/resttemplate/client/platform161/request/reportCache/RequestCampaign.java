package com.resttemplate.client.platform161.request.reportCache;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestCampaign {

    private boolean exclude;

    @JsonProperty("object_ids")
    private List<String> objectIds;
}
