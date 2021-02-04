package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.WelcomePageConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//creating restTemplate object
		RestTemplate template=new RestTemplate();
		String endPointUrl="http://localhost:8081/welcome";
		ResponseEntity<String> entity = template.getForEntity(endPointUrl, String.class );
		int code = entity.getStatusCode().value();
		if(code==200)
		System.out.println(entity.getBody());
	}
}
