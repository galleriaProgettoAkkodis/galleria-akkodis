package com.progettogallery.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progettogallery.entities.Galleria;

public interface GalleriaRepo extends JpaRepository<Galleria, Long>{

	public Galleria findById(long id);
	
	public List<Galleria> findAll();
	
	public Optional<Galleria> findByTitolo(String titolo);
}