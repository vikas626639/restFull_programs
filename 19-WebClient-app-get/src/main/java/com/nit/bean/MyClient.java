package com.nit.bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.client.WebClient;
@Controller
public class MyClient {

		public void getResponceClient() {
			//create the webclient object 
			String url="localhost:8081/welcome";
			WebClient client=WebClient.create();
			String block = client.get().uri(url).retrieve().bodyToMono(String.class).block();
			System.out.println(block);
		}
}
