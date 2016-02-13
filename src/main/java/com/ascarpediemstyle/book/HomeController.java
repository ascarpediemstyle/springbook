package com.ascarpediemstyle.book;


import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ascarpediemstyle.book.entity.Book;
import com.ascarpediemstyle.book.service.BookServiceImpl;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private Properties applicationProperties;
	
	@Autowired
	private BookServiceImpl bookService;	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		bookService.print();
		Book book = bookService.getBookByName("CCC");
		List<Book> books = bookService.getBooks("CCC");
		logger.info(book.getBookName());
		logger.info(Integer.toString(books.size()));
		return "home";
	}
	
	@RequestMapping(value = "/s", method = RequestMethod.GET)
	public String s( Model model) {	
 
        
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list( Model model) { 
		List<Book> books = bookService.getBooks();		
		model.addAttribute("books", books );		
		return "book/list";
	}
	
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String show( Model model) { 
		Book book = bookService.getBookByName("CCC");		
		model.addAttribute("book", book );		
		return "book/show";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		logger.info("ここ");		
		
		Book book = bookService.getBookByName("CCC");
		logger.info(book.getBookName());
		return "book/test";
	}
	
}
