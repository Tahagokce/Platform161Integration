package com.resttemplate.client.platform161.request.partialCreativeFiles;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.resttemplate.client.platform161.models.GenericMultipleRelation;
import com.resttemplate.client.platform161.models.GenericSingleRelation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestRelationships {

    @JsonProperty("partial_creatives")
    private GenericMultipleRelation partialCreatives;

    @JsonProperty("ad_server")
    private GenericSingleRelation adServer;


}
