package com.nit.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.pojo.Student;
import com.nit.pojo.Students;

@RestController
public class StudentRestController {

	@GetMapping(value = "/student", produces = {"application/json","application/xml"})
	public Students getStudentRecord(Students student) {
		//creating student object
		//Students student=new Students();
		Student s=null,s1=null,s3=null;
		List<Student>list=new ArrayList<Student>();
			s=new Student();
			s.setStudentid(101);
			s.setStudentName("prabha");
			s.setStudentAge(20);
			s.setStudentSkill("spring_boot");
			s1=new Student();
			s1.setStudentid(102);
			s1.setStudentName("ritika");
			s1.setStudentAge(22);
			s1.setStudentSkill("core java");
			s3=new Student();
			s3.setStudentid(103);
			s3.setStudentName("vikas");
			s3.setStudentAge(23);
			s3.setStudentSkill("restfull_microservice");
			list.add(s);
			list.add(s1);
			list.add(s3);
		student.setStudents(list);
		return student;
	}
}
