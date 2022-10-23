package com.webapp.librarymanagementapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.librarymanagementapp.dao.AuthorRepository;
import com.webapp.librarymanagementapp.entities.Author;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@Transactional
	public void addAuthor(Author author) {
		this.authorRepository.save(author);
	}
	
	public void saveOrUpdate(Author author)   
	{  
	authorRepository.save(author);  
	}  
	
	public List<Author> getAuthor(){
		List<Author> authorList = (List) this.authorRepository.findAll();
		return authorList;
	}
	
	public void delete(int id) {
		this.authorRepository.deleteById(id);
	}

	
 
	
	
}
