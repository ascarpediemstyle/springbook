package com.ascarpediemstyle.book.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.ascarpediemstyle.book.entity.Book;
import com.ascarpediemstyle.book.repository.custom.BookRepositoryCustom;

public class BookRepositoryImpl implements BookRepositoryCustom {
	
    @Autowired
    EntityManager entityManager;

	@Override
	public List<Book> findBooks(String name) {
		List<Book> results = entityManager
	            .createNativeQuery("select * from book where book_name = :book_name", Book.class)
	            .setParameter("book_name", name)
	            .getResultList();
		return results;
	}
   


}
