package com.resttemplate.client.platform161.response.mediaPlan;


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

    @JsonProperty("booked_budget")
    private double bookedBudget;

    @JsonProperty("unlimited_budget")
    private boolean unlimitedBudget;

    @JsonProperty("start_on")
    private String startOn ;

    @JsonProperty("end_on")
    private String endOn ;

    @JsonProperty("frequency_cap")
    private String frequencyCap ;

    @JsonProperty("frequency_cap_type")
    private String frequencyCapType ;

    @JsonProperty("frequency_cap_count")
    private String frequencyCapCount ;

    private String impressions ;

    private String clicks ;

    private String ecpa ;

    private String ecpm ;

    private String ecpc ;

    @JsonProperty("total_booked_budget_spent")
    private String totalBookedBudgetSpent ;

    @JsonProperty("remaining_booked_budget")
    private double remainingBookedBudget ;

    @JsonProperty("flight_on_time_percentage")
    private String flightOnTimePercentage ;

    private String conversions ;

    @JsonProperty("total_cost_ecpm")
    private String totalCostEcpm ;

    @JsonProperty("total_cost_ecpa")
    private String totalCostEcpa ;

    @JsonProperty("total_cost_ecpc")
    private String totalCostEcpc ;

    @JsonProperty("total_spend_yesterday")
    private String totalSpendYesterday ;

    @JsonProperty("total_on_time_percentage_yesterday")
    private String totalOnTimePercentageYesterday ;

    @JsonProperty("target_value")
    private String targetValue;

    @JsonProperty("target_type")
    private String targetType;

    @JsonProperty("on_time_percentage_yesterday")
    private String onTimePercentageYesterday ;

    @JsonProperty("campaigns_count")
    private String campaignsCount ;

    @JsonProperty("secondary_frequency_cap")
    private String secondaryFrequencyCap ;

    @JsonProperty("secondary_frequency_cap_type")
    private String secondaryFrequencyCapType ;

    @JsonProperty("secondary_frequency_cap_count")
    private String secondaryFrequencyCapCount ;

    @JsonProperty("total_campaigns_budget_spent")
    private String totalCampaignsBudgetSpent ;

    @JsonProperty("remaining_media_budget")
    private String remainingMediaBudget ;

    @JsonProperty("spend_yesterday")
    private String spendYesterday ;

    @JsonProperty("total_media_budget_spent")
    private String totalMediaBudgetSpent ;

    @JsonProperty("projected_spend")
    private String projectedSpend ;

    @JsonProperty("optimal_spend_today")
    private String optimalSpendtoday ;

    @JsonProperty("optimal_spend_yesterday")
    private String optimalSpendYesterday ;

    @JsonProperty("total_optimal_spend_yesterday")
    private String totalOptimalSpendYesterday ;

    @JsonProperty("media_budget")
    private double mediaBudget ;

    @JsonProperty("use_platform161_tech_fee")
    private boolean usePlatform161TechFee;

    @JsonProperty("platform161_tech_fee")
    private double platform161TechFee;

    @JsonProperty("agency_fee")
    private double agencyFee ;

    @JsonProperty("under_over_delivery")
    private String underOverDelivery ;

    @JsonProperty("has_unlimited_budget_campaigns")
    private boolean hasUnlimitedBudgetCampaigns ;

    private boolean active ;

    private int ctr ;

    private boolean favorite ;

    @JsonProperty("alert_on_campaigns")
    private boolean alertOnCampaigns ;

}
