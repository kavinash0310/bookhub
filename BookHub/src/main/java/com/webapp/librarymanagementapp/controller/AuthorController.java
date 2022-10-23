package com.webapp.librarymanagementapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.librarymanagementapp.entities.Author;
import com.webapp.librarymanagementapp.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	
	@GetMapping("/author")
	public List<Author> authorHandler(Model m) {
		
		List<Author> authorList = authorService.getAuthor();
		m.addAttribute("authors", authorList);
		return authorList;
	}

	@GetMapping("/addnewauthor")
	public String addNewAuthorHandler() {
		
		return "addnewauthor";
	}
	
	
	@PostMapping("/addnewauthor")
	public String addNewAuthorHandler(@RequestBody Author author) {
		System.out.println(author);
		authorService.addAuthor(author);
		return "redirect:/dashboard";
	}

	
	@DeleteMapping("/deleteauthor")
	public String deleteAuthorHandler(@PathVariable int id) {
		authorService.delete(id);
		return "redirect:/dashboard";
	}
	
	/*
	@GetMapping("/editauthor/{id}")
	public String editAuthorHandler(Model m,@PathVariable int id) {
		Optional<Author> author = this.authorService.findAuthor(id);
		System.out.println(author);
		m.addAttribute("author", author.get());

		return "editauthor";
	}
*/
	
	@PutMapping("/updateauthors")  
	public String update(@RequestBody Author author)   
	{  
	authorService.saveOrUpdate(author);  
	return "redirect:/dashboard";  
	}  
	
	
}
