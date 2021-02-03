package com.nit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.request.PassangerInfo;
import com.nit.responce.Ticket;

@RestController
public class rail_rest_Controller {
	
	@PostMapping(value = "/bookticket", produces = {"application/json",
													"application/xml"}, 
			
										consumes = {"application/json",
													"application/xml"}
				)
	public ResponseEntity<Ticket>bookTicket(@RequestBody PassangerInfo info){
		//create object of ticket class
		Ticket t=new Ticket();
		t.setTicketStatus("confirmed");
		t.setTicketId("94516465");
		t.setPassangerName(info.getFirstName()+" "+info.getLastname());
		t.setJourneyDate(info.getJourneyDate());
		t.setFrom(info.getFrom());
		t.setTo(info.getTo());
		t.setTrainNumber(info.getTrainNumber());
		t.setTicketPrice(345.00);
		return new ResponseEntity<>(t,HttpStatus.CREATED);
	}
	
	//generate passanger xml form
	@GetMapping(value = "/getxml", produces = {"application/json","application/xml"})
	public PassangerInfo getXml() {
		//creating passanger object
		PassangerInfo i=new PassangerInfo();
		i.setFirstName("vikas");
		i.setLastname("yadav");
		i.setFrom("shahdol");
		i.setTo("jabalpur");
		i.setJourneyDate("aaj");
		i.setTrainNumber("98915");
		return i;
	}
}
