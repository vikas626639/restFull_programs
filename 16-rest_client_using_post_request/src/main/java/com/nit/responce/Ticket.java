package com.nit.responce;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {
	private String ticketId;
	private String ticketStatus;
	private Double ticketPrice;
	private String PassangerName;
	private String from;
	private String to;
	private String journeyDate;
	private String trainNumber;
}
