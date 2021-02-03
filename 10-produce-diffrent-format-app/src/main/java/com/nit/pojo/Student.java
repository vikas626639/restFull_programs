package com.nit.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@XmlRootElement(name = "Student")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(value = Include.NON_NULL)
public class Student {
	@XmlElement(name = "Student-id")
	@JsonProperty("student-id")
	private Integer studentid;
	@XmlElement(name = "Student-Name")
	@JsonProperty("student-Name")
	private String studentName;
	@XmlElement(name = "Student-Skill")
	@JsonProperty("student-Skill")
	private String studentSkill;
	@XmlElement(name = "Student-Age")
	@JsonProperty("student-Age")
	private Integer studentAge;
}
