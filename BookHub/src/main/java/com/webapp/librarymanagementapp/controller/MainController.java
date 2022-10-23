package com.webapp.librarymanagementapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.librarymanagementapp.entities.Book;
import com.webapp.librarymanagementapp.service.BookService;

@RestController
public class MainController {
	
	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/dashboard")
	public List<Book> dashboardHandler(Model m) {
		
		List<Book> bookList = bookService.getBooks();
		m.addAttribute("books", bookList);
		return bookList;
	}

	@GetMapping("/addnewbook")
	public String addNewBookHandler() {
		
		return "addnewbook";
	}
	

	@PostMapping("/addnewbook")
	public String addNewBookHandler(@RequestBody Book book) {
		bookService.addBook(book);
		return "redirect:/dashboard";
	}

	
	
	@DeleteMapping("/deletebook/{id}")
	public String deleteBookHandler(@PathVariable int id) {
		bookService.deleteBook(id);
		return "redirect:/dashboard";
	}
	
	
	@GetMapping("/editbook/{id}")
	public Optional<Book> editBookHandler(Model m,@PathVariable int id) {
		Optional<Book> book = this.bookService.findBook(id);
		System.out.println(book);
		m.addAttribute("book", book.get());

		return book;
	}
	
	@PostMapping("/editbook/{id}")
	public String editBookHandler(@RequestBody Book book,@PathVariable int id) {
		//int storedId=id;
		deleteBookHandler(id);
		//System.out.println("+++++++++++++++++++++++++++++++"+book);
		book.setId(id);
		//System.out.println("________________________"+book);
		bookService.update(book, id);
		return "redirect:/dashboard";
	}
	

}


