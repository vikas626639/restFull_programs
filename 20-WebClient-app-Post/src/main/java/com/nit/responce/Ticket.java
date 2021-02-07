package com.nit.responce;

import lombok.Data;

@Data
//@XmlRootElement(name="Ticket")
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
