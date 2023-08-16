package br.com.mongodb.rodrigofreitas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mongodb.rodrigofreitas.entity.Product;
import br.com.mongodb.rodrigofreitas.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public void save(String name, String description){	
		//Product product = new Product(name, description); //sem ID
		Product product = new Product("1",name, description); //com ID
		
		this.productRepository.save(product);   //save e uptade 
	//	this.productRepository.insert(product); //apenas save, da erro se ID já existir
	}
	
	//criei esse método pq no vídeo ele apenas apaga e substitui e método anterior
	public void find(String name){
		Product product = this.productRepository.findBlusa(name);
		System.out.println(product.getDescription());
	}
}
