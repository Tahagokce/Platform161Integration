package com.resttemplate.client.platform161.response.campaignsActivation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseAttributes {

    private boolean active;

    private boolean archived;

    private String name;

    private double price;

    @JsonProperty("booked_budget")
    private double bookedBudget;

    private String goal;

    private boolean managed;

    @JsonProperty("unlimited_budget")
    private boolean unlimitedBudget;

    @JsonProperty("delivery_type")
    private String deliveryType;

    @JsonProperty("domain_filter")
    private String domainFilter;

    @JsonProperty("frequency_cap")
    private String frequencyCap;

    @JsonProperty("frequency_cap_count")
    private String frequencyCapCount;

    @JsonProperty("frequency_cap_type")
    private String frequencyCapType;

    @JsonProperty("mobile_app_filter")
    private String mobileAppFilter;

    @JsonProperty("mobile_apps_filter")
    private String mobileAppsFilter;

    @JsonProperty("internal_purchase_order_number")
    private String internalPurchaseOrderNumber;

    @JsonProperty("minimum_ctr_percentage")
    private String minimumCtrPercentage;

    private String pacing;

    @JsonProperty("postal_code_filter")
    private String postalCodeFilter;

    @JsonProperty("postal_code_targeting")
    private String postalCodeTargeting;

    @JsonProperty("pricing_type")
    private String pricingType;

    @JsonProperty("rtb_domain_sets_filter")
    private String rtbDomainSetsFilter;

    @JsonProperty("rtb_optimize_conversion_id")
    private String rtbOptimizeConversionId;

    @JsonProperty("rtb_price")
    private String rtbPrice;

    @JsonProperty("section_filter")
    private String sectionFilter;

    private int impressions;

    private String clicks;

    private String ctr;

    private String ecpa;

    private String ecpm;

    private String ecpc;

    private boolean compensation;

    @JsonProperty("invoice_name")
    private String invoiceName;

    @JsonProperty("leading_invoice")
    private String leadingInvoice;

    @JsonProperty("external_purchase_order_number")
    private String externalPurchaseOrderNumber;

    @JsonProperty("designated_market_area_filter")
    private String designatedMarketAreaFilter;

    @JsonProperty("rtb_domain_filter")
    private String rtbDomainFilter;

    @JsonProperty("country_filter")
    private String countryFilter;

    @JsonProperty("region_filter")
    private String regionFilter;

    @JsonProperty("city_filter")
    private String cityFilter;

    @JsonProperty("lifetime_spent")
    private double lifetimeSpent;

    @JsonProperty("mobile_carrier_filter")
    private String mobileCarrierFilter;

    @JsonProperty("isp_domain_filter")
    private String ispDomainFilter;

    private String conversions;

    @JsonProperty("timing_algorithm")
    private String timingAlgorithm;

    @JsonProperty("on_time_percentage_yesterday")
    private String onTimePercentageYesterday;

    @JsonProperty("use_targeting_sets_in_behavioural_targeting")
    private boolean useTargetingSetsInBehaviouralTargeting;

    @JsonProperty("cpa_goal")
    private String cpaGoal;

    @JsonProperty("optimized_margin_fee_percentage")
    private String optimizedMarginFeePercentage;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("use_postal_codes_in_behavioural_targeting")
    private boolean usePostalCodesInBehaviouralTargeting;

    @JsonProperty("daily_cap_before_fees")
    private String dailyCapBeforeFees;

    @JsonProperty("optimizing_conversion_pixel_id")
    private String optimizingConversionPixelId;

    @JsonProperty("daily_cap")
    private String dailyCap;

    @JsonProperty("lat_long_only")
    private boolean latLongOnly;

    @JsonProperty("visibility_targeting")
    private List<String> visibilityTargeting;

    @JsonProperty("minimum_visible_area")
    private String minimumVisibleArea;

    @JsonProperty("minimum_time_in_view")
    private String minimumTimeInView;

    @JsonProperty("delivery_target")
    private String deliveryTarget;

    @JsonProperty("meetrics_reporting")
    private boolean meetricsReporting;

    @JsonProperty("secondary_frequency_cap")
    private String secondaryFrequencyCap;

    @JsonProperty("secondary_frequency_cap_type")
    private String secondaryFrequencyCapType;

    @JsonProperty("secondary_frequency_cap_count")
    private String secondaryFrequencyCapCount;

    @JsonProperty("video_placement_type")
    private List<String> videoPlacementType;

    @JsonProperty("open_auction_allowed")
    private boolean openAuctionAllowed;

    @JsonProperty("total_campaign_budget")
    private double totalCampaignBudget;

    @JsonProperty("rewarded_video")
    private boolean rewardedVideo;

    private boolean interstitial;

    @JsonProperty("min_cpm")
    private String minCpm;

    @JsonProperty("max_cpm")
    private String maxCpm;

    @JsonProperty("max_bid")
    private String maxBid;

    @JsonProperty("app_bundle_filter")
    private String appBundleFilter;

    @JsonProperty("app_bundle_targeting")
    private String appBundleTargeting;

    @JsonProperty("vpaid_targeting")
    private String vpaidTargeting;

    @JsonProperty("secure_traffic_targeting")
    private String secureTrafficTargeting;

    @JsonProperty("custom_user_rating")
    private Object customUserRating;

    @JsonProperty("appnexus_segment_id_targeting")
    private Object appnexusSegmentIdTargeting;

    @JsonProperty("player_size_targeting")
    private List<String> playerSizeTargeting;

    @JsonProperty("video_completion_goal")
    private String videoCompletionGoal;

    @JsonProperty("video_completion_goal_percentage")
    private String videoCompletionGoalPercentage;

    @JsonProperty("app_targeting_sets_filter")
    private String appTargetingSetsFilter;

    @JsonProperty("activated_at")
    private String activatedAt;

    @JsonProperty("agency_fee_percentage")
    private double agencyFeePercentage;

    private String margin;

    @JsonProperty("use_platform161_tech_fee")
    private boolean usePlatform161TechFee;

    @JsonProperty("platform161_tech_fee")
    private double platform161TechFee;

    @JsonProperty("lat_long_targeting")
    private List<String> latLongTargeting;

    @JsonProperty("video_ad_format_type")
    private List<String> videoAdFormatType;

    @JsonProperty("net_price")
    private double netPrice;

    @JsonProperty("optimal_spend_yesterday")
    private String optimalSpendYesterday;

    @JsonProperty("optimal_spend_today")
    private String optimalSpendToday;

    @JsonProperty("under_over_delivery")
    private double underOverDelivery;

    @JsonProperty("projected_spend")
    private double projectedSpend;

    @JsonProperty("spend_yesterday")
    private double spendYesterday;

    @JsonProperty("media_budget")
    private double mediaBudget;

    @JsonProperty("remaining_budget")
    private double remainingBudget;

    @JsonProperty("remaining_media_budget")
    private double remainingMediaBudget;

    @JsonProperty("remaining_booked_budget")
    private double remainingBookedBudget;

    @JsonProperty("total_cost_ecpm")
    private int totalCostEcpm;

    @JsonProperty("total_cost_ecpa")
    private int totalCostEcpa;

    @JsonProperty("total_cost_ecpc")
    private int totalCostEcpc;

    @JsonProperty("total_optimal_spend_yesterday")
    private String totalOptimalSpendYesterday;

    @JsonProperty("total_spend_yesterday")
    private double totalSpendYesterday;

    @JsonProperty("total_on_time_percentage_yesterday")
    private String totalOnTimePercentageYesterday;

    @JsonProperty("total_campaign_cost")
    private double totalCampaignCost;

    @JsonProperty("total_life_spent")
    private double totalLifeSpent;

    @JsonProperty("default_video_visibility")
    private String defaultVideoVisibility;

    @JsonProperty("default_display_visibility")
    private String defaultDisplayVisibility;

    @JsonProperty("budget_as_first_goal")
    private boolean budgetAsFirstGoal;

    private String rating;

    private List<String> nscs;

    @JsonProperty("bid_ratings_viewability")
    private String bidRatingsViewability;

    @JsonProperty("targeting_logic")
    private String targetingLogic;

    private boolean favorite;

    private String alert;

    @JsonProperty("flight_on_time_percentage")
    private String flightOnTimePercentage;

    @JsonProperty("override_rtb_price")
    private boolean overrideRtbPrice;

    @JsonProperty("has_video_creatives")
    private boolean hasVideoCreatives;

    @JsonProperty("optimizing_pixel_editable")
    private boolean optimizingPixelEditable;

    @JsonProperty("ads_txt")
    private List<String> adsTxt;

    @JsonProperty("supply_types")
    private List<String> supplyTypes;

    @JsonProperty("connection_type_targeting")
    private List<String> connectionTypeTargeting;

    @JsonProperty("total_lifetime_spent")
    private double totalLifetimeSpent;

    @JsonProperty("temporal_targeting")
    private Object temporalTargeting;

    @JsonProperty("rtb_optimize_type")
    private String rtbOptimizeType;


}