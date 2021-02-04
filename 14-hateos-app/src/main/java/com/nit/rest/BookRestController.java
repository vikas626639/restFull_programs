package com.nit.rest;

import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.pojo.Book;

@RestController
@RequestMapping("/bookController")
public class BookRestController {

	@GetMapping("/getbookinfo")
	public Book getBookInfo() {
		//creating object of Book class
		Book book=new Book();
		book.setBookid(101);
		book.setAuthorName("Rod-Johnson");
		book.setBookName("Spring");
		book.setBookPrice(100l);
		Link moreserch = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookRestController.class).getlistofBookInfo()).withSelfRel();
		book.add(moreserch);
		return book;
	}
	
	@GetMapping("/getlistbookinfo")
	public List<Book> getlistofBookInfo() {
		//creating object of Book class
		Book b=new Book(102, "core java", "harikrishna", 200l);
		Book b1=new Book(103, "advance java", "natraj", 200l);
		Book b2=new Book(104, "spring", "rod-johnson", 200l);
		Book b3=new Book(105, "hibernate", "gavin king", 200l);
		return List.of(b, b1, b2, b3);
	}
}
