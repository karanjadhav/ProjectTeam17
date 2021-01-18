package com.DigitalBarter.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DigitalBarter.exception.ResourceNotFoundException;
import com.DigitalBarter.model.Book;
import com.DigitalBarter.repository.BookRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class BookController {
	@Autowired
	private BookRepository bookRepository;
	
	//get all books
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return bookRepository.findAll();
		
	}
	//create book rest api
	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		 return bookRepository.save(book);
	}
	
	//get book by id rest api
	@GetMapping("/books/{isbn}")
	public ResponseEntity<Book>  getBookByIsbn(@PathVariable String isbn)
	{
		Book book = bookRepository.findByIsbn(isbn);
		return ResponseEntity.ok(book);
		
	}
	
	//update employee rest api
	@PutMapping("/books/{isbn}")
	public ResponseEntity<Book> updateBook(@PathVariable String isbn,@RequestBody Book bookDetails)
	{
		Book book = bookRepository.findByIsbn(isbn);
		book.setTitle(bookDetails.getTitle());
		book.setUserid(book.getUserid());
		book.setAuthor(bookDetails.getAuthor());
		book.setPublisher(bookDetails.getPublisher());
		book.setGenre(bookDetails.getGenre());
		book.setIsbn(bookDetails.getIsbn());
		book.setCost(bookDetails.getCost());
		
		Book updatedBook= bookRepository.save(book);
		return ResponseEntity.ok(updatedBook);
		
	}
}
