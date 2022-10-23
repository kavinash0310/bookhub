package com.webapp.librarymanagementapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.webapp.librarymanagementapp.dao.AuthorRepository;
import com.webapp.librarymanagementapp.dao.BookRepository;

@SpringBootApplication
public class Assignment41Application {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Assignment41Application.class, args);
		BookRepository bookRepository = context.getBean(BookRepository.class);
		AuthorRepository authorRepository = context.getBean(AuthorRepository.class);
	}

}
