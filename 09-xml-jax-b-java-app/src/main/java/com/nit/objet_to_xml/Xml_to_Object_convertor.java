package com.nit.objet_to_xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Xml_to_Object_convertor {
	public static void main(String[] args) throws JAXBException {
		//create File object to read file
		File file=new File("student.xml");
		//create JaxbContext object to read file
		JAXBContext jaxbcontext=JAXBContext.newInstance(Student.class);
		Unmarshaller Unmarshaller = jaxbcontext.createUnmarshaller();
		Student st = (Student) Unmarshaller.unmarshal(file);
		System.out.println(st);
	}
}
