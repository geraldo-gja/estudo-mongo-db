package br.com.mongodb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.mongodb.service.ProductService;


@Configuration
@Profile("config")
public class Config {
	
	@Autowired
	private ProductService productService;
	
	@Bean
	public void instanciaBaseDeDados() {
		System.out.println("Executou método [instanciaBaseDeDados] da classe [Config]");
		
		this.productService.save("blusa", "blusa vermelha"); //sem ID
		this.productService.find("blusa");
	}

}
