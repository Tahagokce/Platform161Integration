package com.resttemplate.client.platform161.response.reportCache;

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

    private List<String> totals;

    @JsonProperty("data_rows")
    private List<String> dataRows;
}
