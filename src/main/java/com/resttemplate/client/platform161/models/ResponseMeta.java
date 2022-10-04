package com.resttemplate.client.platform161.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMeta {

    @JsonProperty("current_page")
    private int currentPage;

    @JsonProperty("next_page")
    private int nextPage;

    @JsonProperty("previous_page")
    private String previousPage;

    @JsonProperty("total_pages")
    private int totalPages;

    @JsonProperty("total_count")
    private int totalCount;

}
