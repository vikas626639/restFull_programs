package com.nit.responce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@XmlRootElement(name="Ticket")
@XmlAccessorType(XmlAccessType.FIELD)
public class Ticket {
	@JsonProperty("Ticket-Id")
	@XmlElement(name="Ticket-Id")
	private String ticketId;
	
	@JsonProperty("Ticket-Status")
	@XmlElement(name="Ticket-Status")
	private String ticketStatus;
	
	@JsonProperty("Ticket-Price")
	@XmlElement(name="Ticket-Price")
	private Double ticketPrice;
	
	@JsonProperty("Passanger-Name")
	@XmlElement(name="Passanger-Name")
	private String PassangerName;
	
	@JsonProperty("From")
	@XmlElement(name="From")
	private String from;
	
	@JsonProperty("To")
	@XmlElement(name="To")
	private String to;
	
	@JsonProperty("Journey-Date")
	@XmlElement(name="Journey-Date")
	private String journeyDate;
	
	@JsonProperty("Train-Number")
	@XmlElement(name="Train-Number")
	private String trainNumber;
}
