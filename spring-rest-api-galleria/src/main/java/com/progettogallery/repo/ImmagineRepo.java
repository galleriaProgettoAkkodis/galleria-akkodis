package com.progettogallery.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progettogallery.entities.Immagine;

public interface ImmagineRepo extends JpaRepository<Immagine, Long>{

	public Immagine findById(long id);
	
	public List<Immagine> findAll();
	
	public Immagine findByTitolo(String titolo);
	
}