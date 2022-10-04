package com.resttemplate.client.platform161.request.campaigns;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RequestAttributes {

    @JsonProperty("agency_fee_percentage")
    private int agencyFeePercentage;

    @JsonProperty("booked_budget")
    private int bookedBudget;

    private String ctr;

    @JsonProperty("daily_cap")
    private String dailyCap;

    @JsonProperty("delivery_type")
    private String deliveryType;

    @JsonProperty("frequency_cap_type")
    private String frequencyCapType;

    @JsonProperty("secondary_frequency_cap_type")
    private String secondaryFrequencyCapType;

    private String goal ;

    @JsonProperty("leading_invoice")
    private String leadingInvoice;

    private String margin;

    @JsonProperty("minimum_ctr_percentage")
    private String minimumCtrPercentage;

    private String name;

    private String pacing;

    @JsonProperty("googleInventorySourceType")
    private String google_inventory_source_type;

    @JsonProperty("google_display_creative_type")
    private String googleDisplayCreativeType ;

    @JsonProperty("google_rotate_creative_type")
    private String googleRotateCreativeType ;

    @JsonProperty("platform161_tech_fee")
    private double platform161TechFee;

    private int price;

    @JsonProperty("pricing_type")
    private String pricingType;

    @JsonProperty("rtb_optimize_type")
    private String rtbOptimizeType;

    @JsonProperty("rtb_price")
    private String rtbPrice;

    @JsonProperty("target_type")
    private String targetType;

    @JsonProperty("timing_algorithm")
    private String timingAlgorithm;

    @JsonProperty("unlimited_budget")
    private boolean unlimitedBudget;

    @JsonProperty("use_platform161_tech_fee")
    private boolean usePlatform161TechFee;

    @JsonProperty("strategy_card")
    private String strategyCard ;

    @JsonProperty("strategy_tctr_percentage")
    private String strategyTctrPercentage;

    @JsonProperty("strategy_pc_pv_conversion")
    private String strategyPcPvConversion;

    @JsonProperty("video_completion_goal_percentage")
    private String videoCompletionGoalPercentage;

    @JsonProperty("start_on_date")
    private String startOnDate;

    @JsonProperty("start_on_hour")
    private String startOnHour;

    @JsonProperty("start_on_min")
    private String startOnMin;

    @JsonProperty("end_on_date")
    private String endOnDate;

    @JsonProperty("end_on_hour")
    private String endOnHour;

    @JsonProperty("end_on_min")
    private String endOnMin;

    @JsonProperty("campaign_conversion_pixels_attributes")
    private String campaignConversionPixelsAttributes;

    @JsonProperty("supply_types")
    private List<String> supplyTypes;

    @JsonProperty("city_filter")
    private String cityFilter;

    @JsonProperty("country_filter")
    private String countryFilter;

    @JsonProperty("designated_market_area_filter")
    private String designatedMarketAreaFilter;

    @JsonProperty("lat_long_only")
    private boolean latLongOnly;

    @JsonProperty("lat_long_targeting")
    private List<String> latLongTargeting;

    @JsonProperty("postal_code_filter")
    private String postalCodeFilter;

    @JsonProperty("postal_code_targeting")
    private String postalCodeTargeting;

    @JsonProperty("region_filter")
    private String regionFilter;

    @JsonProperty("targeting_logic")
    private String targetingLogic;

    @JsonProperty("use_postal_codes_in_behavioural_targeting")
    private boolean usePostalCodesInBehaviouralTargeting;

}
