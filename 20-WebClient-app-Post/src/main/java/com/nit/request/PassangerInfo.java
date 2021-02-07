package com.nit.request;

import lombok.Data;

@Data
//@XmlRootElement(name="PassangerInfo")

public class PassangerInfo {
	private String firstName;
	private String lastname;
	private String from;
	private String to;
	private String journeyDate;
	private String trainNumber;
}
