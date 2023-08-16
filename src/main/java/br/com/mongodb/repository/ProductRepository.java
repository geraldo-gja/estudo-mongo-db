package br.com.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.mongodb.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

	@Query("{'name': ?0}")
	Product findBlusa(String name);
	
}
