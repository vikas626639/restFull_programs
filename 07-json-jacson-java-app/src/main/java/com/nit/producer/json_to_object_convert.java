package com.nit.producer;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class json_to_object_convert {
	public static void main(String[] args) {
		//JsontoObjectconvert();
		convertJsonArrayToObject();
	}
	//converting single json record to object
	public static void JsontoObjectconvert() {
		try {
			//create FileInputStream object
			File f=new File("student.json");
			//create Object mapper class object
			ObjectMapper mapper=new ObjectMapper();
			Student st = mapper.readValue(f, Student.class);
			System.out.println(st);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//converting arrays record as object
	public static void convertJsonArrayToObject() {
		try {
			//create FileInputStream object
			File f=new File("students.json");
			//create Object mapper class object
			ObjectMapper mapper=new ObjectMapper();
			Student[] st = mapper.readValue(f, Student[].class);
			for(Student s:st) {
				System.out.println(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
