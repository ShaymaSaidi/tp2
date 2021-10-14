package com.shayma.livres;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shayma.livres.entities.Genre;
import com.shayma.livres.entities.Livre;
import com.shayma.livres.repos.LivreRepository;

@SpringBootTest
class LivresApplicationTests {

	@Autowired
	private LivreRepository LivreRepository;

	
	
	
	@Test
	public void testCreateLivre() {
		Livre prod = new Livre("aaaa",2200.500,new Date());
		LivreRepository.save(prod);
	}
	
	@Test
	public void testFindLivre()
	{
		Livre p = LivreRepository.findById(1L).get();
	System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit()
	{
		Livre p = LivreRepository.findById(1L).get();
	p.setPrixLivre(1000.0);
	LivreRepository.save(p);
	}
	
	@Test
	public void testDeleteLivre()
	{
		LivreRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousLivres()
	{
	  List<Livre> prods = LivreRepository.findAll();
		for (Livre p : prods)
		{
		  System.out.println(p);
		}
	}
	
	
	 @Test
	 public void testFindByNomLivre()
	 {
	   List<Livre> prods = LivreRepository.findByNomLivre("aaaa");
	   for (Livre p : prods)
	   {
	     System.out.println(p);
	   }
	 }
	 
	 
	 @Test
	 public void testFindByNomLivreContains ()
	 {
	   List<Livre> prods=LivreRepository.findByNomLivreContains("d");
	   for (Livre p : prods)
	   {
	     System.out.println(p);
	   } 
	 }
	 
	 
	 @Test
	 public void testfindByNomPrix()
	 {
	   List<Livre> prods = LivreRepository.findByNomPrix("bbbb", 2000.0);
	   for (Livre p : prods)
	   {
	     System.out.println(p);
	   }
	 }
	 
	 
	 @Test
	 public void testfindByGenre()
	 {
		 Genre cat = new Genre();
	   cat.setIdCat(1L);
	   List<Livre> prods = LivreRepository.findByGenre(cat);
	   for (Livre p : prods)
	   {
	     System.out.println(p);
	   }
	 }

	 
	 @Test
	 public void findByGenreIdCat()
	 {
	   List<Livre> prods = LivreRepository.findByGenreIdCat(1L);
	   for (Livre p : prods)
	   {
	     System.out.println(p);
	   }
	 }
	 
	 @Test
	 public void testfindByOrderByNomLivreAsc()
	 {
	   List<Livre> prods = LivreRepository.findByOrderByNomLivreAsc();
	   for (Livre p : prods)
	   {
	      System.out.println(p);
	   }
	 }
		 
	 @Test
	 public void testTrierLivresNomsPrix()
	 {
	   List<Livre> prods = LivreRepository.trierLivresNomsPrix();
	   for (Livre p : prods)
	   {
	      System.out.println(p);
	   }
	 }

	
}
