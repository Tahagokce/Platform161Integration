package com.resttemplate.client.platform161.response.partialCreativeFiles;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IncludedResponseAttributes {

    @JsonProperty("dma_tracker")
    private boolean dmaTracker;

    private boolean postback;

    private String kind;

    @JsonProperty("click_url")
    private String clickUrl;

    private String name;

    private boolean dma;

}
