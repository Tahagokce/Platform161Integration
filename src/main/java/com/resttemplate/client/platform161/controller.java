package com.resttemplate.client.platform161;

import com.resttemplate.client.platform161.request.advertisers.AdvertisersRequest;
import com.resttemplate.client.platform161.request.campaigns.CampaignsRequest;
import com.resttemplate.client.platform161.request.campaignsActivation.CampaignsActivationRequest;
import com.resttemplate.client.platform161.request.mediaPlans.MediaPlansRequest;
import com.resttemplate.client.platform161.request.partialCreativeFiles.PartialCreativeFilesRequest;
import com.resttemplate.client.platform161.request.reportCache.ReportCacheRequest;
import com.resttemplate.client.platform161.response.advertisers.AdvertisersResponse;
import com.resttemplate.client.platform161.response.campaigns.CampaignsResponse;
import com.resttemplate.client.platform161.response.campaignsActivation.CampaignsActivationResponse;
import com.resttemplate.client.platform161.response.campaignsGet.CampaignsGetResponse;
import com.resttemplate.client.platform161.response.creatives.CreativesResponse;
import com.resttemplate.client.platform161.response.mediaPlan.MediaPlanResponse;
import com.resttemplate.client.platform161.response.partialCreativeFiles.PartialCreativeFilesResponse;
import com.resttemplate.client.platform161.response.reportCache.ReportCacheResponse;
import com.resttemplate.client.platform161.response.thirdpartydatasegments.ThirdPartyDataSegmentsResponse;
import com.resttemplate.client.platform161.response.updateCustomer.UpdateCustomerResponse;
import com.resttemplate.client.platform161.store.TokenStore;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/adplus")
@RequiredArgsConstructor
public class controller {

    private final RestTemplate restTemplate;


    @PostMapping("/updatecustomer")
    public UpdateCustomerResponse updateCustomerResponse (@RequestBody UpdateCustomerResponse updateCustomerResponse){
        return updateCustomerResponse;
    }


    @PostMapping("/cache")
    public ReportCacheResponse postCampaigns(@RequestBody ReportCacheRequest reportCacheRequest){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", "bearer " + TokenStore.getAccessToken());

        HttpEntity<ReportCacheRequest> request = new HttpEntity<>(reportCacheRequest, httpHeaders);

        ReportCacheResponse response = restTemplate.postForEntity(
                "https://testing.platform161.com/api/internal/turkcell/report_cache?force_new_measures=true"
                , request
                , ReportCacheResponse.class
        ).getBody();


        return response;

    }


    @GetMapping("/details")
    public CampaignsGetResponse getCampaignsDetails() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", "bearer " + TokenStore.getAccessToken());

        HttpEntity request = new HttpEntity(httpHeaders);

        CampaignsGetResponse response = restTemplate.exchange(
                "https://testing.platform161.com/api/v3/turkcell/campaigns/2380884"
                , HttpMethod.GET
                , request
                , CampaignsGetResponse.class
        ).getBody();

        return response;
    }


    @PutMapping("/update")
    public CampaignsActivationResponse patchCampaignsUpdate(@RequestBody CampaignsActivationRequest campaignsActivationRequest) {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", "bearer " + TokenStore.getAccessToken());

        HttpEntity request = new HttpEntity(campaignsActivationRequest,httpHeaders);


        var result =  restTemplate.exchange(
                "https://testing.platform161.com/api/v3/turkcell/campaigns/"+campaignsActivationRequest.getData().getId()
                ,HttpMethod.PUT
                ,request
        ,CampaignsActivationResponse.class
        ).getBody();

        return result;

    }


    @GetMapping("/creatives")
    public CreativesResponse getCreatives() {


        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", "bearer " + TokenStore.getAccessToken());

        HttpEntity request = new HttpEntity(httpHeaders);


        CreativesResponse response = this.restTemplate.exchange(
                "https://testing.platform161.com/api/v3/turkcell/creatives"
                , HttpMethod.GET
                , request
                , CreativesResponse.class
        ).getBody();

        return response;
    }


    @PostMapping("/partial")
    public PartialCreativeFilesResponse postPartial(@RequestBody PartialCreativeFilesRequest creativeFilesRequest) {

        HttpHeaders httpHeaders = new HttpHeaders();


        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", "bearer " + TokenStore.getAccessToken());
        ;


        HttpEntity<PartialCreativeFilesRequest> request = new HttpEntity<>(creativeFilesRequest, httpHeaders);

        PartialCreativeFilesResponse response = this.restTemplate.postForEntity("https://testing.platform161.com/api/v3/turkcell/partial_creative_files?include=partial_creatives.ad_server"
                , request
                , PartialCreativeFilesResponse.class
        ).getBody();
        return response;

    }


    @PostMapping("/campaigns")
    public CampaignsResponse postCampaigns(@RequestBody CampaignsRequest campaignsRequest) {


        HttpHeaders httpHeaders = new HttpHeaders();


        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", "bearer " + TokenStore.getAccessToken());
        ;


        HttpEntity<CampaignsRequest> request = new HttpEntity<>(campaignsRequest, httpHeaders);

        CampaignsResponse response = this.restTemplate.postForEntity("https://testing.platform161.com/api/v3/turkcell/campaigns"
                , request
                , CampaignsResponse.class
        ).getBody();
        return response;

    }


    @GetMapping("/tpds")
    public ThirdPartyDataSegmentsResponse getTPDS() {


        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", "bearer " + TokenStore.getAccessToken());

        HttpEntity request = new HttpEntity(httpHeaders);


        ThirdPartyDataSegmentsResponse response = this.restTemplate.exchange(
                "https://testing.platform161.com/api/v3/turkcell/third_party_data_segments"
                , HttpMethod.GET
                , request
                , ThirdPartyDataSegmentsResponse.class
        ).getBody();
        return response;
    }


    @PostMapping("/media")
    public MediaPlanResponse media(@RequestBody MediaPlansRequest mediaPlansRequest) {


        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", "bearer " + TokenStore.getAccessToken());


        HttpEntity<MediaPlansRequest> request = new HttpEntity<MediaPlansRequest>(mediaPlansRequest, httpHeaders);

        return this.restTemplate.postForEntity("https://testing.platform161.com/api/v3/turkcell/media_plans"
                , request
                , MediaPlanResponse.class
        ).getBody();

    }


    @PostMapping("/advertiser")
    public AdvertisersResponse advertisers(@RequestBody AdvertisersRequest advertisersRequest) {


        HttpHeaders httpHeaders = new HttpHeaders();


        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", "bearer " + TokenStore.getAccessToken());

        HttpEntity<AdvertisersRequest> request = new HttpEntity<AdvertisersRequest>(advertisersRequest, httpHeaders);

        AdvertisersResponse response = this.restTemplate.postForEntity("https://testing.platform161.com/api/v3/turkcell/advertisers"
                , request
                , AdvertisersResponse.class
        ).getBody();


        return response;

    }




    /*    public Mono<AdvertisersResponse> advertiser(AdvertisersRequest advertisersRequest) {


        Mono<AdvertisersResponse> result =
                platform161WebClient.post()
                        .uri(Platform161Configuration.PLATFORM161_PROP.getAdvertisersPostURI())
                        .header("Authorization","bearer " + TokenStore.getAccessToken())
                        .body(Mono.just(advertisersRequest), AdvertisersRequest.class)
                        .retrieve()
                        .onStatus(HttpStatus::is4xxClientError, response -> {
                            log.error("Platform 161 Service client error : {}", response.rawStatusCode());
                            return Mono.error(new ServiceCallException("Platform 161 Service client Error : " + response.rawStatusCode()));
                        })
                        .onStatus(HttpStatus::is5xxServerError, response -> {
                            log.error("Platform 161 Service server error : {}", response.rawStatusCode());
                            return Mono.error(new ServiceCallException("Platform 161 Service server Error : " + response.rawStatusCode()));
                        })
                        .bodyToMono(AdvertisersResponse.class);

        log.info(Platform161Configuration.PLATFORM161_PROP.getAdvertisersPostURI()+" Post request successful.");

        return result;

    }*/

/*
    public Mono<MediaPlanResponse> media(MediaPlansRequest mediaPlansRequest) {


        Mono<MediaPlanResponse> result =
                platform161WebClient.post()
                        .uri(Platform161Configuration.PLATFORM161_PROP.getMediaPlanPostURI())
                        .header("Authorization", "bearer " + TokenStore.getAccessToken())
                        .body(Mono.just(mediaPlansRequest), MediaPlansRequest.class)
                        .retrieve()
                        .onStatus(HttpStatus::is4xxClientError, response -> {
                            log.error("Platform 161 Service client error : {}", response.rawStatusCode());
                            return Mono.error(new ServiceCallException("Platform 161 Service client Error : " + response.rawStatusCode()));
                        })
                        .onStatus(HttpStatus::is5xxServerError, response -> {
                            log.error("Platform 161 Service server error : {}", response.rawStatusCode());
                            return Mono.error(new ServiceCallException("Platform 161 Service server Error : " + response.rawStatusCode()));
                        })

                        .bodyToMono(MediaPlanResponse.class);

        log.info(Platform161Configuration.PLATFORM161_PROP.getMediaPlanPostURI()+" Post request successful.");

        return result;
    }
*/


/*    @Scheduled(fixedRate = 45*60000)
    public void refreshToken () {
        log.info("Platform 161 Token Refresher Execute...");

        platform161Service.getUserToken().subscribe(resp -> {
            TokenStore.setAccessToken(resp.getAccessToken());
            log.info("Platform 161 Token refresh successfully completed.");
        });
    }*/



/*    @Bean
    public WebClient platform161WebClient() {
        log.info("Creating platform161 web client...");
        WebClient client = WebClient.builder()
                .baseUrl(PLATFORM161_PROP.getUrl())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
        log.info("Created platform161 web client.");
        return client;
    }
    */


}