package com.resttemplate.client.platform161.response.campaignsGet;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseAttributes {

        public boolean active;

        public boolean archived;

        public String name;

        public double price;

        @JsonProperty("booked_budget")
        public double bookedBudget;

        public String goal;

        public boolean managed;

        @JsonProperty("unlimited_budget")
        public boolean unlimitedBudget;

        @JsonProperty("delivery_type")
        public String deliveryType;

        @JsonProperty("domain_filter")
        public String domainFilter;

        @JsonProperty("frequency_cap")
        public String frequencyCap;

        @JsonProperty("frequency_cap_count")
        public String frequencyCapCount;

        @JsonProperty("frequency_cap_type")
        public String frequencyCapType;

        @JsonProperty("mobile_app_filter")
        public String mobileAppFilter;

        @JsonProperty("mobile_apps_filter")
        public String mobileAppsFilter;

        @JsonProperty("internal_purchase_order_number")
        public String internalPurchaseOrderNumber;

        @JsonProperty("minimum_ctr_percentage")
        public String minimumCtrPercentage;

        public String pacing;

        @JsonProperty("postal_code_filter")
        public String postalCodefilter;

        @JsonProperty("postal_code_targeting")
        public String postal_code_targeting;

        @JsonProperty("pricing_type")
        public String pricingType;

        @JsonProperty("rtb_domain_sets_filter")
        public String rtbDomainSetsFilter;

        @JsonProperty("rtb_optimize_conversion_id")
        public String rtbOptimizeConversionId;

        @JsonProperty("rtb_price")
        public String rtbPrice;

        @JsonProperty("section_filter")
        public String sectionFilter;

        public int impressions;

        public String clicks;

        public String ctr;

        public String ecpa;

        public String ecpm;

        public String ecpc;

        public boolean compensation;

        @JsonProperty("invoice_name")
        public String invoiceName;

        @JsonProperty("leading_invoice")
        public String leadingInvoice;

        @JsonProperty("external_purchase_order_number")
        public String externalPurchaseOrderNumber;

        @JsonProperty("designated_market_area_filter")
        public String designatedMarketAreaFilter;

        @JsonProperty("rtb_domain_filter")
        public String rtbDomainFilter;

        @JsonProperty("country_filter")
        public String countryFilter;

        @JsonProperty("region_filter")
        public String regionDilter;

        @JsonProperty("city_filter")
        public String cityFilter;

        @JsonProperty("lifetime_spent")
        public double lifetimeSpent;

        @JsonProperty("mobile_carrier_filter")
        public String mobileCarrierFilter;

        @JsonProperty("isp_domain_filter")
        public String ispDomainFilter;

        public Object conversions;

        @JsonProperty("timing_algorithm")
        public String timingAlgorithm;

        @JsonProperty("on_time_percentage_yesterday")
        public String onTimePercentageYesterday;

        @JsonProperty("use_targeting_sets_in_behavioural_targeting")
        public boolean useTargetingSetsInBehaviouralTargeting;

        @JsonProperty("cpa_goal")
        public String cpaGoal;

        @JsonProperty("optimized_margin_fee_percentage")
        public String optimizedMarginFeePercentage;

        @JsonProperty("start_date")
        public String startDate;

        @JsonProperty("end_date")
        public String endDate;

        @JsonProperty("start_on")
        public String startOn;

        @JsonProperty("end_on")
        public String endOn;

        @JsonProperty("use_postal_codes_in_behavioural_targeting")
        public boolean usePostalCodesInBehaviouralTargeting;

        @JsonProperty("daily_cap_before_fees")
        public String dailyCapBeforeFees;

        @JsonProperty("optimizing_conversion_pixel_id")
        public String optimizingConversionPixelId;

        @JsonProperty("daily_cap")
        public String dailyCap;

        @JsonProperty("lat_long_only")
        public boolean latLongOnly;

        @JsonProperty("visibility_targeting")
        public List<String> visibilityTargeting;

        @JsonProperty("minimum_visible_area")
        public String minimumVisibleArea;

        @JsonProperty("minimum_time_in_view")
        public String minimumTimeInView;

        @JsonProperty("delivery_target")
        public String deliveryTarget;

        @JsonProperty("meetrics_reporting")
        public boolean meetricsReporting;

        @JsonProperty("secondary_frequency_cap")
        public String secondaryFrequencyCap;

        @JsonProperty("secondary_frequency_cap_type")
        public String secondaryFrequencyCapType;

        @JsonProperty("secondary_frequency_cap_count")
        public String secondaryFrequencyCapCount;

        @JsonProperty("video_placement_type")
        public List<String> videoPlacementType;

        @JsonProperty("open_auction_allowed")
        public boolean openAuctionAllowed;

        @JsonProperty("total_campaign_budget")
        public String totalCampaignBudget;

        @JsonProperty("rewarded_video")
        public boolean rewardedVideo;

        public boolean interstitial;

        @JsonProperty("min_cpm")
        public String minCpm;

        @JsonProperty("max_cpm")
        public String maxCpm;

        @JsonProperty("max_bid")
        public String maxBid;

        @JsonProperty("agency_fee_percentage")
        public String agencyFeePercentage;

        public String margin;

        @JsonProperty("use_platform161_tech_fee")
        public boolean usePlatform161TechFee;

        @JsonProperty("platform161_tech_fee")
        public double platform161TechFee;

        @JsonProperty("net_price")
        public double netPrice;

        @JsonProperty("optimal_spend_yesterday")
        public String optimalSpendYesterday;

        @JsonProperty("optimal_spend_today")
        public String optimalSpendtoday;

        @JsonProperty("under_over_delivery")
        public double underOverDelivery;

        @JsonProperty("projected_spend")
        public double projectedSpend;

        @JsonProperty("spend_yesterday")
        public double spendYesterday;

        @JsonProperty("media_budget")
        public double mediaBudget;

        @JsonProperty("remaining_budget")
        public double remainingBudget;

        @JsonProperty("remaining_media_budget")
        public double remainingMediaBudget;

        @JsonProperty("remaining_booked_budget")
        public double remainingBookedBudget;

        @JsonProperty("total_cost_ecpm")
        public int totalCostEcpm;

        @JsonProperty("total_cost_ecpa")
        public int totalCostEcpa;

        @JsonProperty("total_cost_ecpc")
        public int totalCostEcpc;

        @JsonProperty("total_optimal_spend_yesterday")
        public String totalOptimalSpendYesterday;

        @JsonProperty("total_spend_yesterday")
        public double totalSpendYesterday;

        @JsonProperty("total_on_time_percentage_yesterday")
        public String totalOnTimePercentageYesterday;

        @JsonProperty("total_campaign_cost")
        public double totalcampaignCost;

        @JsonProperty("total_life_spent")
        public double totalLifeSpent;

        @JsonProperty("default_video_visibility")
        public String defaultVideoVisibility;

        @JsonProperty("default_display_visibility")
        public String defaultDisplayVisibility;

        public boolean favorite;

        public String alert;

        @JsonProperty("flight_on_time_percentage")
        public String flightOnTimePercentage;

        @JsonProperty("override_rtb_price")
        public boolean overrideRtbPrice;

        @JsonProperty("optimizing_pixel_editable")
        public boolean optimizingPixelEditable;

        @JsonProperty("supply_types")
        public List<String> supplyTypes;

        @JsonProperty("connection_type_targeting")
        public List<String> connectionTypeTargeting;

        @JsonProperty("total_lifetime_spent")
        public double totalLifetimeSpent;

        @JsonProperty("rtb_optimize_type")
        public String rtbOptimizeType;


}
