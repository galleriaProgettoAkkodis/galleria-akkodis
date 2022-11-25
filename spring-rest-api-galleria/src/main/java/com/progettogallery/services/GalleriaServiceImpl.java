package com.progettogallery.services;

import java.util.List;
import java.util.Optional;

public class GalleriaServiceImpl implements GalleriaService {
	private GalleriaRepo repo;
	
	public GalleriaServiceImpl(GalleriaRepo repo) {
		this.repo = repo;
	}
	
	// restituisce la lista di tutte le gallerie
	@Override
	public Optional<List<Galleria>> listGalleries() {
		return repo.findAll().orElseThrow(/* RisorsaNonTrovataException */);
	}

	// crea una galleria con il titolo
	@Override
	public void createGallery(String title) {
		Gallery gallery = new Gallery();
		gallery.setTitle(title);
		repo.save(gallery);
	}

}
