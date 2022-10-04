package com.resttemplate.client.platform161.request.advertisers;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestAttributes {

    private String name ;

    @JsonProperty("advertiser_url")
    private String advertiserUrl ;

    @JsonProperty("fee_percentage")
    private String feePercentage ;


}
