package br.com.mongodb.javatechie.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Book")
public class Book {

	@Id
	private int id;
	private String bookName;
	private String authorName;
	
}
