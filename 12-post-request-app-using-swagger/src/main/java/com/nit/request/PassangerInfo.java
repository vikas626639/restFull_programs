package com.nit.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="PassangerInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class PassangerInfo {
	@XmlElement(name="First-Name")
	private String firstName;
	@XmlElement(name="Last-Name")
	private String lastname;
	@XmlElement(name="From")
	private String from;
	@XmlElement(name="To")
	private String to;
	@XmlElement(name="Journey-Date")
	private String journeyDate;
	@XmlElement(name="Train-Number")
	private String trainNumber;
}
