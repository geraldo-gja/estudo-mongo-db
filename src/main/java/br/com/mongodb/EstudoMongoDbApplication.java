package br.com.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudoMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoMongoDbApplication.class, args);
	}
	
	/*
	 * BUG 
 	 * não consegui fazer o método run funcionar, nem o @Override
 	 * precisei criar a classe 'Config' e modificar o application.properties para funcionar
	 * 
	@Autowired
	private ProductService productService;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("chamou aqui");
		this.productService.save("blusa", "blusa vermelha");
	}
	*/
}
