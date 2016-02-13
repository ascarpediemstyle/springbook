package com.ascarpediemstyle.book.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ascarpediemstyle.book.dataaccess.BookRepository;
import com.ascarpediemstyle.book.model.Book;


@Service
public class BookServiceImpl {
	
	private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
	
	@Autowired
	private BookRepository bookRepository;
	
	
	public List<Book> getBooks(){
		return bookRepository.findAll();
	}
	
	public void print() {
		// TODO Auto-generated method stub
		logger.info("aaaaaaa");
		
	}
	

}
