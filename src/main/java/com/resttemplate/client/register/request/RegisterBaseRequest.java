package com.resttemplate.client.register.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@XmlRootElement
public class RegisterBaseRequest {
    @XmlElement
    private ServiceRequest serviceRequest;
}
