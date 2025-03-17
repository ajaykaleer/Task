package com.clover.bookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clover.bookStore.entity.Book;
import com.clover.bookStore.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookservice;
	
	@GetMapping()
	public List<Book>getAllBooks(){
		return bookservice.getAllBooks();
		
	}
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookservice.getBookById(id);
    }
	@PostMapping("/create")
	public Book createBook(@RequestBody Book book) {
		return bookservice.saveBook(book);
		
	}
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookservice.deleteBook(id);
        return "Book deleted successfully!";
    }
	

}
