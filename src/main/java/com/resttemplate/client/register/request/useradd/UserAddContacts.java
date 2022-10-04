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
public class UserAddContacts {
    @XmlElement
    private String firstName;
    @XmlElement
    private String lastName;
    @XmlElement
    private String emailAddress;
    @XmlElement
    private String telephoneNumber;
    @XmlElement
    private String addressLine1;
    @XmlElement
    private String addressLine2;
    @XmlElement
    private String city;
    @XmlElement
    private String province;
    @XmlElement
    private String state;
    @XmlElement
    private String postalCode;
    @XmlElement
    private String countryCode;
    @XmlElement
    private String contactType;
}
