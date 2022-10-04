package com.resttemplate.client.platform161.response.thirdpartydatasegments;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseAttributes {

    private String name ;

    private String code ;

    private String kind ;

    @JsonProperty("disabled_in_third_party")
    private boolean disabledInThirdParty ;

    @JsonProperty("unique_users")
    private String uniqueUsers ;

    @JsonProperty("segment_name")
    private String segmentName ;

    @JsonProperty("cpm_price")
    private double cpmPrice ;
}
