package com.nit.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {

	@GetMapping(value = "/student/{id}", produces = "application/json")
	public Student getStudentData(@PathVariable("id")int id) {
		Student s=null;
		s=new Student();
		if(id==101) {
			s.setStudentid(101);
			s.setStudentname("vikas");
			s.setStudentSkill("java");
		}else if(id==102) {
			s.setStudentid(102);
			s.setStudentname("prabha");
			s.setStudentSkill("spring");
		}
		return s;
	}
}
//for converting java object to json format spring internally uses jacson api