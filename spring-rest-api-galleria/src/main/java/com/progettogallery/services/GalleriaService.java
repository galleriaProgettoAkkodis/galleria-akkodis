package com.progettogallery.services;

import java.util.List;
import java.util.Optional;

import com.progettogallery.entities.Galleria;

public interface GalleriaService {
	// lista gallerie (GET)
	public List<Galleria> listGalleries();
	public Galleria findByTitolo(String titolo);
	public void save(Galleria g);
	// crea galleria vuota (POST)
	public void createGallery(String title);
}
