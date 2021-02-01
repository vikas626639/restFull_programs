package com.nit.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Student {
	@JsonProperty("STUDENT-ID")
	private int studentid;
	@JsonProperty("STUDENT-NAME")
	private String studentname;
	@JsonProperty("STUDENT-SKILL")
	private String studentSkill;
}
