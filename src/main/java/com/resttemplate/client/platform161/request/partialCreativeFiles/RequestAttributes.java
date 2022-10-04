package com.resttemplate.client.platform161.request.partialCreativeFiles;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestAttributes {

    @JsonProperty("base64_data")
    private String base64Data;

    @JsonProperty("original_filename")
    private String originalFilename;

    @JsonProperty("content_type")
    private String contentType;

    @JsonProperty("manual_thirdparty")
    private boolean manualThirdparty;

}
