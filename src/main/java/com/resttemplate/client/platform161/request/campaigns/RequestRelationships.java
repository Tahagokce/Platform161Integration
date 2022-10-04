package com.resttemplate.client.platform161.request.campaigns;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.resttemplate.client.platform161.models.GenericMultipleRelation;
import com.resttemplate.client.platform161.models.GenericSingleRelation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RequestRelationships {

    private RequestOffer offer;

    private GenericSingleRelation advertiser;

}
