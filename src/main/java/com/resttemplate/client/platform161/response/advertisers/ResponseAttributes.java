package com.resttemplate.client.platform161.response.advertisers;


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

    private boolean active ;

    @JsonProperty("credit_limit")
    private String creditLimit ;

    @JsonProperty("db_cr_number")
    private String dbCrNumber ;

    private String email ;

    private String address ;

    @JsonProperty("postal_code")
    private String postalCode ;

    private String city ;

    private String region ;

    private String phone ;

    private String mobile ;

    private String fax ;

    @JsonProperty("use_business_address_for_billing")
    private boolean useBusinessAddressForBilling;

    @JsonProperty("billing_address")
    private String billingAddress;

    @JsonProperty("billing_postal_code")
    private String billingPostalCode;

    @JsonProperty("billing_city")
    private String billingCity;

    @JsonProperty("billing_region")
    private String billingRegion;

    @JsonProperty("billing_phone")
    private String billingPhone;

    @JsonProperty("billing_mobile")
    private String billingMobile;

    @JsonProperty("billing_fax")
    private String billingFax;

    @JsonProperty("billing_email")
    private String billingEmail;

    private boolean archived;

    @JsonProperty("fee_percentage")
    private String feePercentage ;

    @JsonProperty("default_video_visibility")
    private String defaultVideoVisibility;

    @JsonProperty("discount_a")
    private String discountA;

    @JsonProperty("discount_b")
    private String  discountB;

    @JsonProperty("advertiser_url")
    private String advertiserUrl ;

    @JsonProperty("alert_on_campaigns")
    private boolean alertOnCampaigns ;

}
