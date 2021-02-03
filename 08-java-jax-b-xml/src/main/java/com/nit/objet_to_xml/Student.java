package com.nit.objet_to_xml;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@Data
@XmlRootElement(name = "Student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	@XmlElement( name = "Student-id")
	private Integer Studentid;
	@XmlElement(name = "Student-Name")
	private String studentName;
	@XmlElement(name = "Student-Skill")
	private String studentSkill;
	@XmlElement(name = "Student-Age")
	private Integer studentAge;
}
