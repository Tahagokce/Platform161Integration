package com.resttemplate.client.platform161.response.partialCreativeFiles;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.resttemplate.client.platform161.models.GenericSingleRelation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IncludedResponseRelationships {

    @JsonProperty("ad_server")
    private GenericSingleRelation adServer;

    private GenericSingleRelation size;

    private GenericSingleRelation file;
}
