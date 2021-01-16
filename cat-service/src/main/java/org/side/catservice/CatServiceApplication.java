package org.side.catservice;

import org.side.catservice.dao.ProduitRepository;
import org.side.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {
	//injection de dépendance avec
	@Autowired
	private ProduitRepository produitRepository;
	public static void main(String[] args) {
		SpringApplication.run(CatServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		produitRepository.save(new Produit(null, "Ordinateur Lx 45", 6700 , 3 ));
		produitRepository.save(new Produit(null, "Iprimante" , 1700 ,3));
		produitRepository.save(new Produit(null,"Smart Phone Samsung S9"  ,8000 , 13));

		produitRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});
	}
}
