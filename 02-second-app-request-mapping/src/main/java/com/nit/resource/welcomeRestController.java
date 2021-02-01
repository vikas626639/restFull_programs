package com.nit.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class welcomeRestController {
		
	@GetMapping(value = "/test")
	//@GetMapping
	public String welcomeMsg() {
		String msg="welcome to restfull service";
		return msg;
	}
	
	@GetMapping
	public String wishmsg() {
		String msg="Good mourning";
		return msg;
	}
}
