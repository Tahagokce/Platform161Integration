package com.resttemplate.client.platform161.response.advertisers;


import com.fasterxml.jackson.annotation.JsonProperty;
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


    private GenericSingleRelation agency;

    private GenericSingleRelation country;

    @JsonProperty("billing_country")
    private GenericSingleRelation billingCountry;

    @JsonProperty("sales_manager")
    private GenericSingleRelation salesManager;

    @JsonProperty("campaign_manager")
    private GenericSingleRelation campaignManager;

    private GenericMultipleRelation campaigns;

    private GenericMultipleRelation creatives;

    @JsonProperty("media_plans")
    private GenericMultipleRelation mediaPlans;

    private GenericMultipleRelation pixels;

    @JsonProperty("conversion_pixels")
    private GenericMultipleRelation conversionPixels;

    @JsonProperty("retargeting_pixels")
    private GenericMultipleRelation retargetingPixels;

    private GenericMultipleRelation redirects;

    @JsonProperty("data_segments")
    private GenericMultipleRelation dataSegments;

    @JsonProperty("third_party_data_segments")
    private GenericMultipleRelation thirdPartyDataSegments;

    @JsonProperty("custom_data_segments")
    private GenericMultipleRelation customDataSegments;

    private GenericMultipleRelation placements;

    @JsonProperty("domain_sets")
    private GenericMultipleRelation domainSets;

    private GenericMultipleRelation sections;

    private GenericMultipleRelation channels;

    @JsonProperty("direct_deals")
    private GenericMultipleRelation directDeals;

    @JsonProperty("targeting_sets")
    private GenericMultipleRelation targetingSets;

    @JsonProperty("data_targeting_sets")
    private GenericMultipleRelation dataTargetingSets;

    @JsonProperty("thirdparty_technology_partners")
    private GenericMultipleRelation thirdpartyTechnologyPartners;

    private GenericMultipleRelation notes;


}
