package com.resttemplate.client.platform161.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseLinks {

    private String self;

    private String first;

    private String next;

    private String last;
}
