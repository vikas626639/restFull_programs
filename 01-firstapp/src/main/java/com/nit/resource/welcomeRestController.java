package com.nit.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeRestController {
		
	@GetMapping(value = "/welcome")
	public String welcomeMsg() {
		String msg="welcome to restfull service";
		return msg;
	}
}
