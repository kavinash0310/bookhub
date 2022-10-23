package com.webapp.librarymanagementapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.librarymanagementapp.dao.BookRepository;
import com.webapp.librarymanagementapp.entities.Book;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	@Transactional
	public void addBook(Book book) {
		this.bookRepository.save(book);
	}
	
	public void saveOrUpdate(Book book)   
	{  
	bookRepository.save(book);  
	}  
	
	public List<Book> getBooks(){
		List<Book> bookList = (List) this.bookRepository.findAll();
		return bookList;
	}
	
	public void deleteBook(int id) {
		this.bookRepository.deleteById(id);
	}
	
	public Optional<Book> findBook(int id) {
		return this.bookRepository.findById(id);
		//return book;
	}
	
	public void update(Book book, int bookid)   
	{  
		bookRepository.save(book);  
	}  
	
}
