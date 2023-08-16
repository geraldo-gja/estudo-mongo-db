package br.com.mongodb.rodrigofreitas.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "product-new")
public class Product {

	@Id
	private String id;
	private String name;
	private String description;
	
}
