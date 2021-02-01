package com.nit.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseDuration {
		
	//below method is working with requestparam 
		@GetMapping(value = {"/","/course"})
		public String getCourseDuration(@RequestParam("cname")String cname) {
			
			cname=("java".equals(cname))?"Duration : 3 months":
				  ("project".equals(cname))?"Duration : 4 months":
				  "plese check our website for more details www.vikas.com";
			return cname;	
		}
		
	//working with path param	
		@GetMapping(value = {"/course1/{cname}"})
		public String getCourseDuration1(@PathVariable("cname")String cname) {
			
			cname=("java".equals(cname))?"Duration : 3 months":
				("project".equals(cname))?"Duration : 4 months":
					"plese check our website for more details www.vikas.com";
			return cname;	
		}
	//workint with multipath param 
		@GetMapping(value = {"/name/{first}/{last}"})
		public String getCourseDuration1(@PathVariable("first")String first,@PathVariable("last")String last) {
			
		return "hiii your name is="+first+" "+last;	
		}
}
