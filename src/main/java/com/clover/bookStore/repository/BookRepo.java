package com.clover.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clover.bookStore.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long>{
	
	
	
}
