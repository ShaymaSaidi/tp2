package com.shayma.livres.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.shayma.livres.entities.Genre;
import com.shayma.livres.entities.Livre;


public interface LivreService {
	Livre saveLivre(Livre p);
	Livre updateLivre(Livre p);
	void deleteLivre(Livre p);
	 void deleteLivreById(Long id);
	 Livre getLivre(Long id);
	List<Livre> getAllLivres();
	Page<Livre> getAllLivresParPage(int page, int size);

	List<Livre> findByNomLivre(String nom);
	List<Livre> findByNomLivreContains(String nom);
	List<Livre> findByNomPrix (String nom, Double prix);
	List<Livre> findByGenre (Genre genre);
	List<Livre> findByGenreIdCat(Long id);
	List<Livre> findByOrderByNomLivreAsc();
	List<Livre> trierLivresNomsPrix();

}
