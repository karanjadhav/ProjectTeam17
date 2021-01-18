package com.DigitalBarter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int BookId;
	private String isbn;
	private int userid;
	private String title;
	private String author;
	

	private String genre;
	private String publisher;
	private float cost;
	public Book() {
		super();
	}
	public Book( String isbn, String title, String author, String genre, String publisher, float cost) {
		super();
		
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.publisher = publisher;
		this.cost = cost;
	}
	
	
	
	public Book( String isbn, int userid, String title, String author, String genre, String publisher,
			float cost) {
		super();
		
		this.isbn = isbn;
		this.userid = userid;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.publisher = publisher;
		this.cost = cost;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public Book orElseThrow(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
