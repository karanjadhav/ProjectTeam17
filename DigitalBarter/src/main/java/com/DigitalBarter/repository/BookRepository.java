package com.DigitalBarter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DigitalBarter.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

	Book findByIsbn(String isbn);

	//List<Book> findAll();

}
