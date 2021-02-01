package com.nit.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {
	@RequestMapping("/course")
	public String courseDetails(@RequestParam(value="course", required = false)String course) {
		return "hii vikas "+course;
	}
}
