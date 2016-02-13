package com.ascarpediemstyle.book.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ascarpediemstyle.book.entity.Book;
import com.ascarpediemstyle.book.repository.BookRepository;


@Service
public class BookServiceImpl {
	
	private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
	
	@Autowired
	private BookRepository bookRepository;
	
	
	public List<Book> getBooks(){
		
		return bookRepository.findAll();
	}
	
public List<Book> getBooks(String name){
		
		return bookRepository.findBooks(name);
	}
	
	public Book getBookByName(String name){
		return bookRepository.findByBookName(name);
	}
	
	public void print() {
		// TODO Auto-generated method stub
		logger.info("aaaaaaa");
		
	}
	

}
