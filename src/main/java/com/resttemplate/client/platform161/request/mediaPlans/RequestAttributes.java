package com.resttemplate.client.platform161.request.mediaPlans;


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

    @JsonProperty("booked_budget")
    private double bookedBudget;

    @JsonProperty("agency_fee")
    private double agencyFee ;

    @JsonProperty("use_platform161_tech_fee")
    private boolean usePlatform161TechFee;

    @JsonProperty("platform161_tech_fee")
    private double platform161TechFee;

    @JsonProperty("unlimited_budget")
    private boolean unlimitedBudget;

    private boolean favorite ;

    @JsonProperty("ap_id")
    private String apId;

    @JsonProperty("client_order_id")
    private String clientOrderId;

    @JsonProperty("target_value")
    private String targetValue;

    @JsonProperty("target_type")
    private String targetType;
}
