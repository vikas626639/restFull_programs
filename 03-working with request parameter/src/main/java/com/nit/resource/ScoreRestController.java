package com.nit.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreRestController {
	
	@GetMapping("/test")
	public String getScore(@RequestParam("s")String s) {
		System.out.println(s);
		return "my name is ="+s;
	}
	@GetMapping("/test1")
	public String getfirst_lastName(@RequestParam("f")String first,@RequestParam("l")String last) {
		System.out.println(first+" "+last);
		return "my name is ="+first+" "+last;
	}
}
