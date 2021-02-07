package com.nit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {
	
	public String getinfo() {
		RestTemplate temp=new RestTemplate();
		String url="http://localhost:8080/getxml";
		ResponseEntity<String> forEntity = temp.getForEntity(url, String.class);
		System.out.println(forEntity);
		return url;
		
	}

}
