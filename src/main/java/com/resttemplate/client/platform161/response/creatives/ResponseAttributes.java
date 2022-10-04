package com.resttemplate.client.platform161.response.creatives;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseAttributes {

    private String name;

    private boolean active;

    private String kind;

    @JsonProperty("start_on")
    private String startOn;

    @JsonProperty("end_on")
    private String endOn;

    private boolean archived;
}
