package com.nit.producer;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class obj_to_json_converter {
	public static void main(String[] args) {
		//convertStudentObjToJson();
		convertStudentsobjeToJson();
	}
	
	public static void convertStudentObjToJson() {
		Student s=null;
		ObjectMapper mapper=null;
		try {
			s=new Student();
			s.setStudentid(101);
			s.setStudentName("vikas");
			s.setStudentSkill("java");
			s.setStudentage(20);
			//create object of ObjectMapper
			mapper=new ObjectMapper();
			String jsonString =mapper.writerWithDefaultPrettyPrinter().writeValueAsString(s);
			System.out.println(jsonString);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//convert list of student object to json
	public static void convertStudentsobjeToJson() {
		Student s=null,s1=null,s2=null;
		ObjectMapper mapper=null;
		try {
			s=new Student();
			s.setStudentid(101);
			s.setStudentName("vikas");
			s.setStudentSkill("java");
			s.setStudentage(20);
			s1=new Student();
			s1.setStudentid(102);
			s1.setStudentName("prabja");
			s1.setStudentSkill("java");
			s2=new Student();
			s2.setStudentid(103);
			s2.setStudentName("ritika");
			s2.setStudentSkill("java");
			//create object of ObjectMapper
			mapper=new ObjectMapper();
			String jsonString =mapper.writerWithDefaultPrettyPrinter().writeValueAsString(List.of(s, s1, s2));
			System.out.println(jsonString);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

//we have @jsonIgnor property to ignore perticular property 
//we have @jsonIgnorProperty annotation to ignor more then one property by specifying in value attribute
//we have @JsonProperty to set json value at the level of variable
//we have @jsonInclude to ignore non-null value of property 
