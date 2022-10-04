package com.resttemplate.client.platform161.request.reportCache;

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
public class RequestAttributes {

    private List<String> measures;

   private RequestFilters filters;

   private String interval;

   @JsonProperty("date_limit")
   private String dateLimit;

   private String period;
}
