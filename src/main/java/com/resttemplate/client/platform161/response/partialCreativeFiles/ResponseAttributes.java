package com.resttemplate.client.platform161.response.partialCreativeFiles;

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

    @JsonProperty("original_filename")
    private String originalFilename;

    @JsonProperty("content_type")
    private String contentType;
}
