package com.webapp.librarymanagementapp.dao;


import org.springframework.data.repository.CrudRepository;

import com.webapp.librarymanagementapp.entities.Book;


public interface BookRepository extends CrudRepository<Book, Integer>{
	
}