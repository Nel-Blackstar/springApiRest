package com.openfuture.stacy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		/*ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
	
		produitRepository.save(new Produit("Livre",12,1200));
		produitRepository.save(new Produit("Cahier",23,700));
		produitRepository.save(new Produit("Stylo",12,1500));
		*/
		
	}
	


}

