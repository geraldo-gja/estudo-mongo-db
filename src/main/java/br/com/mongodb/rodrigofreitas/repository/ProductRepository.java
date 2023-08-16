package br.com.mongodb.rodrigofreitas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.mongodb.rodrigofreitas.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

	@Query("{'name': ?0}")
	Product findBlusa(String name);
	
}
