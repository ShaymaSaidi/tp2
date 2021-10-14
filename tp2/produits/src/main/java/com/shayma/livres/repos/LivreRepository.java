package com.shayma.livres.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shayma.livres.entities.Genre;
import com.shayma.livres.entities.Livre;


public interface LivreRepository extends JpaRepository<Livre, Long> {

	List<Livre> findByNomLivre(String nom);
	List<Livre> findByNomLivreContains(String nom);
	
	@Query("select p from Livre p where p.nomLivre like %?1 and p.prixLivre > ?2")
	List<Livre> findByNomPrix (String nom, Double prix);
	
	@Query("select p from Livre p where p.categorie = ?1")
	List<Livre> findByGenre (Genre genre);
	
	List<Livre> findByGenreIdCat(Long id);

	List<Livre> findByOrderByNomLivreAsc();

	@Query("select p from Livre p order by p.nomLivre ASC, p.prixLivre DESC")
	List<Livre> trierLivresNomsPrix ();
	
}
