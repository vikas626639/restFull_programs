package com.nit.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PassangerInfo {
	private String firstName;
	private String lastname;
	private String from;
	private String to;
	private String journeyDate;
	private String trainNumber;
}
