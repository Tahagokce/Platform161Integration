package com.resttemplate.client.platform161.response.campaigns;


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
public class ResponseRelationships {

    private GenericSingleRelation offer;

    private GenericSingleRelation advertiser;

    @JsonProperty("media_plan")
    private GenericSingleRelation mediaPlan;

    @JsonProperty("sales_manager")
    private GenericSingleRelation salesManager;

    @JsonProperty("campaign_manager")
    private GenericSingleRelation campaignManager;

    @JsonProperty("inventory_sources")
    private GenericMultipleRelation inventorySources;

    private GenericMultipleRelation browsers;

    @JsonProperty("conversion_pixels")
    private GenericMultipleRelation conversionPixels;

    private GenericMultipleRelation countries;

    private GenericMultipleRelation regions;

    private GenericMultipleRelation cities;

    private GenericMultipleRelation creatives;

    private GenericMultipleRelation devices;

    @JsonProperty("device_types")
    private GenericMultipleRelation deviceTypes;

    @JsonProperty("filtered_domains")
    private GenericMultipleRelation filteredDomains;

    @JsonProperty("filtered_sections")
    private GenericMultipleRelation filteredSections;

    @JsonProperty("mobile_apps")
    private GenericMultipleRelation mobileApps;

    private GenericMultipleRelation languages;

    @JsonProperty("operating_systems")
    private GenericMultipleRelation operatingSystems;

    @JsonProperty("rtb_domains")
    private GenericMultipleRelation rtbDomains;

    @JsonProperty("rtb_domain_sets")
    private GenericMultipleRelation rtbDomainSets;

    @JsonProperty("rtb_urls")
    private GenericMultipleRelation rtbUrls;

    @JsonProperty("rtb_products")
    private GenericMultipleRelation rtbProducts;

    @JsonProperty("direct_deals")
    private GenericMultipleRelation directDeals;

    @JsonProperty("iab_categories")
    private GenericMultipleRelation iabCategories;

    @JsonProperty("designated_market_areas")
    private GenericMultipleRelation designatedMarketAreas;

    @JsonProperty("premium_inventories")
    private GenericMultipleRelation premiumInventories;

    @JsonProperty("targeting_sets")
    private GenericMultipleRelation targetingSets;

    @JsonProperty("app_targeting_sets")
    private GenericMultipleRelation appTargetingSets;

    @JsonProperty("app_bundle_sets")
    private GenericMultipleRelation appBundleSets;

    @JsonProperty("geo_targeting_sets")
    private GenericMultipleRelation geoTargetingSets;

    @JsonProperty("isp_targeting_sets")
    private GenericMultipleRelation ispTargetingSets;

    private GenericMultipleRelation notes;

    @JsonProperty("campaign_conversion_pixels")
    private GenericMultipleRelation campaignConversionPixels;

    @JsonProperty("mobile_carriers")
    private GenericMultipleRelation mobileCarriers;

    @JsonProperty("isp_domains")
    private GenericMultipleRelation ispDomains;

    @JsonProperty("google_verticals")
    private GenericMultipleRelation googleVerticals;

    @JsonProperty("content_categories")
    private GenericMultipleRelation contentCategories;

    @JsonProperty("bid_rating_segments")
    private GenericMultipleRelation bidRatingSegments;

    @JsonProperty("thirdparty_technology_partners")
    private GenericMultipleRelation thirdpartyTechnologyPartners;

    @JsonProperty("retargeting_pixels")
    private GenericMultipleRelation retargetingPixels;

    @JsonProperty("campaign_inventory_sources")
    private GenericMultipleRelation campaignInventorySources;

    @JsonProperty("campaigns_direct_deals")
    private GenericMultipleRelation campaignsDirectDeals;
}