package br.com.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProductRepository extends MongoRepository<Product, String> {

	@Query("{'name': ?0}")
	Product findBlusa(String name);
	
}
