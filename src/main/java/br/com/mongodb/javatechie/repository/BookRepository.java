package br.com.mongodb.javatechie.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.mongodb.javatechie.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
