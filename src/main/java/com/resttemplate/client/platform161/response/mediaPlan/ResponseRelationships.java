package com.resttemplate.client.platform161.response.mediaPlan;


import com.resttemplate.client.platform161.models.GenericMultipleRelation;
import com.resttemplate.client.platform161.models.GenericSingleRelation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseRelationships {

    private GenericSingleRelation advertiser;

    private GenericMultipleRelation campaigns;
}
