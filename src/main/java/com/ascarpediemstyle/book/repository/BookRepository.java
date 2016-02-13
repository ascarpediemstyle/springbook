package com.ascarpediemstyle.book.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ascarpediemstyle.book.entity.Book;
import com.ascarpediemstyle.book.repository.custom.BookRepositoryCustom;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>,
BookRepositoryCustom {	

	public Book findByBookName(String name);
}
