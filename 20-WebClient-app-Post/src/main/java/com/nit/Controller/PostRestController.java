package com.nit.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.nit.request.PassangerInfo;
import com.nit.responce.Ticket;

@RestController
public class PostRestController {

	public void invockGetRestClient() {
		//create the object of Request
		PassangerInfo info=null;
		info=new PassangerInfo();
		info.setFirstName("vikas");
		info.setFrom("sdl");
		info.setJourneyDate("02-02-1995");
		info.setLastname("yadav");
		info.setTo("jabalpur");
		info.setTrainNumber("79454");
		String url="http://localhost:8085/getxml";
		WebClient client=WebClient.create();
				PassangerInfo responce = client.get()
				.uri(url)
				.retrieve()
				.bodyToMono(PassangerInfo.class)
				.block();
				System.out.println(responce);
	}
	
	
	public void invockPostRestClient() {
		//create the object of Request
		PassangerInfo info=null;
		info=new PassangerInfo();
		info.setFirstName("vikas");
		info.setFrom("sdl");
		info.setJourneyDate("02-02-1995");
		info.setLastname("yadav");
		info.setTo("jabalpur");
		info.setTrainNumber("79454");
		String url="http://localhost:8085/bookticket";
		WebClient client=WebClient.create();
		Ticket responce = client.post()
				.uri(url)
				.body(BodyInserters.fromValue(info))
				.retrieve()
				.bodyToMono(Ticket.class)
				.block();
		System.out.println(responce);
	}

}
