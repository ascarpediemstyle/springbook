package com.ascarpediemstyle.book.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ascarpediemstyle.book.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
