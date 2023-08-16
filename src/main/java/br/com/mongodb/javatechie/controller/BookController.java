package br.com.mongodb.javatechie.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mongodb.javatechie.model.Book;
import br.com.mongodb.javatechie.repository.BookRepository;

@RequestMapping(value = "/book")
@RestController
public class BookController {

	@Autowired
	private BookRepository repository;
	
	@PostMapping
	public String saveBook(@RequestBody Book book) {
		System.out.println("chamou aqui");
		repository.save(book);
		return "Added book with id: " + book.getId();
	}
	
	@GetMapping
	public List<Book> getBooks(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Book> getBook(@PathVariable int id) {
		return repository.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable int id) {
		return "Book deleted with id: " + id;
	}
	
}
