package com.resttemplate.client.platform161.response.thirdpartydatasegments;


import com.resttemplate.client.platform161.models.ResponseMeta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ThirdPartyDataSegmentsResponse {

    private List<ResponseData> data ;

    private ResponseMeta meta ;

    private ResponseLinks links ;
}