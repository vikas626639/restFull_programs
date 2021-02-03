package com.nit.request;

import lombok.Data;

@Data
public class PassangerInfo {
	private int id;
	private String firstName;
	private String lastname;
	private String from;
	private String to;
	private String journeyDate;
	private String trainNumber;
}
