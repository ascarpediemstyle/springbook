package com.ascarpediemstyle.book.repository.custom;

import java.util.List;

import com.ascarpediemstyle.book.entity.Book;

public interface BookRepositoryCustom {
	public List<Book> findBooks(String name);

}
