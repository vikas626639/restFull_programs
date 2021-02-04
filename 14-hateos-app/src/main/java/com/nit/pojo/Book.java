package com.nit.pojo;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book extends RepresentationModel<Book> {
	private Integer bookid;
	private String bookName;
	private String authorName;
	private Long bookPrice;
}
