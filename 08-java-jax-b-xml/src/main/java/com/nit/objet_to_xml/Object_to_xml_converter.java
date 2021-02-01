package com.nit.objet_to_xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Object_to_xml_converter {
		public static void main(String[] args) throws JAXBException, FileNotFoundException {
			Student s = new Student();
			s.setStudentid(101);
			s.setStudentName("vikas");
			s.setStudentSkill("java");
			s.setStudentAge(20);
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//marshaller.marshal(s, System.out);	
			marshaller.marshal(s, new FileOutputStream("student.xml"));	
		}
}

//to work with jaxb make sure the jre 1.8 must be there in classpath otherwise exception will came