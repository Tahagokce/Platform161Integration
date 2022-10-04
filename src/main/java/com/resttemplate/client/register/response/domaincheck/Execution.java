package com.resttemplate.client.register.response.domaincheck;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Execution {
    private String timeSpan;
    private String startDateTime;
    private String endDateTime;

}
