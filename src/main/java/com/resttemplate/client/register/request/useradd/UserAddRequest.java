package com.resttemplate.client.register.request.useradd;

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
public class UserAddRequest {
    @XmlElement
    private String userID;
    @XmlElement
    private String userAccountName;
    @XmlElement
    private UserAddContacts contacts;
}
