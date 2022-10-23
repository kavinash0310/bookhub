package com.webapp.librarymanagementapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.webapp.librarymanagementapp.entities.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

	
}
