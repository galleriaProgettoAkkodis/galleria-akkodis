package com.progettogallery.services;

import java.util.List;
import java.util.Optional;

public interface ImmagineService {
	// lista immagini (GET)
	public Optional<List<Immagine>> listImages();
		
	// inserisce immagine nella galleria (POST)
	public void insertImage(String galleryTitle, long idImage);
}
