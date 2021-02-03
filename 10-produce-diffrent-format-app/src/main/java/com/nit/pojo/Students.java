package com.nit.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="Students")
public class Students {
	List<Student>Students;
}
