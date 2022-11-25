package com.progettogallery.services;

import java.util.List;
import java.util.Optional;

public interface GalleriaService {
	// lista gallerie (GET)
	public Optional<List<Galleria>> listGalleries();
		
	// crea galleria vuota (POST)
	public void createGallery(String title);
}
