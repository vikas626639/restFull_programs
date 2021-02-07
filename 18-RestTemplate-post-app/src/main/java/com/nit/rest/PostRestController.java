package com.nit.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nit.request.PassangerInfo;
import com.nit.responce.Ticket;

@RestController
public class PostRestController {

	public void getResponce() {
		RestTemplate template=new RestTemplate();
		String endPointUrl="http://localhost:8080/getxml";
		ResponseEntity<String> entity = template.getForEntity(endPointUrl, String.class );
		int code = entity.getStatusCode().value();
		if(code==200)
			System.out.println(entity.getBody());
	}

	public void getResponcenew() {
		RestTemplate template=new RestTemplate();
		String endPointUrl="http://localhost:8080/getxml";
		ResponseEntity<PassangerInfo> responce = template.getForEntity(endPointUrl, PassangerInfo.class );
		if(responce.getStatusCodeValue()==200) {
			PassangerInfo body = responce.getBody(); 
			System.out.println(body); 
		}
	}
	
	public void getPostResponce() {
		PassangerInfo info=null;
		try {
			//create the object of request class
			info=new PassangerInfo();
			info.setFirstName("vikas");
			info.setFrom("jabalpur");
			info.setJourneyDate("02-02-2020");
			info.setLastname("yadav");
			info.setTo("jabalpur");
			info.setTrainNumber("02853");
			//set the content-type and accept type 
			
			HttpHeaders headers=new HttpHeaders();
			//headers.add("content-type", "application/json");
			headers.add("content-type", "application/xml");
			//headers.add("accept", "application/json");
			headers.add("accept", "application/xml");
			//send the request 
			//add the headers and object in the requst body of post
			HttpEntity<PassangerInfo> request=new HttpEntity<PassangerInfo>(info,headers);
			//create the object of restTemplate
			RestTemplate template=new RestTemplate();
			String url="http://localhost:8080/bookticket";
			ResponseEntity<Ticket> responce = template.postForEntity(url, request, Ticket.class);
			int code = responce.getStatusCodeValue();
			if(code==201) {
				Ticket body = responce.getBody();
				System.out.println(body);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
