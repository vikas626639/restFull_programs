package com.nit.objet_to_xml;


import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@Data
@XmlRootElement(name = "Student")
public class Student {
	private Integer Studentid;
	private String studentName;
	private String studentSkill;
	private Integer studentAge;
}
