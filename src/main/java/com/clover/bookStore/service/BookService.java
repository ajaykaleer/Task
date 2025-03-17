package com.clover.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clover.bookStore.entity.Book;
import com.clover.bookStore.repository.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo bookrepo;
	
	public List<Book> getAllBooks(){
		return bookrepo.findAll();
		
		}
    public Book getBookById(Long id) {
        return bookrepo.findById(id).orElse(null);
    }

	public Book saveBook(Book book) {
        return bookrepo.save(book);
    }

    public void deleteBook(Long id) {
        bookrepo.deleteById(id);

	
	

}
}