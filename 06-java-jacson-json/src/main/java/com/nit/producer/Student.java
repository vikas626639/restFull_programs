package com.nit.producer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(value = Include.NON_NULL)
public class Student {
		@JsonProperty("Student-id")
		private Integer studentid;
		@JsonProperty("Student-Name")
		private String studentName;
		@JsonProperty("Student-Skill")
		private String studentSkill;
		private Integer studentage;
}
