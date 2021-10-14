package com.shayma.livres;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shayma.livres.entities.Livre;
import com.shayma.livres.service.LivreService;



@SpringBootApplication
public class LivresApplication  implements CommandLineRunner {

	@Autowired
	LivreService livreService;
	public static void main(String[] args) {
	SpringApplication.run(LivresApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		livreService.saveLivre(new Livre("PC Dell", 2600.0, new Date()));
		livreService.saveLivre(new Livre("PC Asus", 2800.0, new Date()));
		livreService.saveLivre(new Livre("Imprimante Epson", 900.0, new Date()));
	}
}
