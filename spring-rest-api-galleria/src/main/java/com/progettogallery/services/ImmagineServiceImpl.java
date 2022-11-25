package com.progettogallery.services;

import java.util.List;
import java.util.Optional;

public class ImmagineServiceImpl implements ImmagineService {
	private ImmagineRepo repo;
	
	// constructor injection 
	public ImmagineServiceImpl(ImmagineRepo repo) {
		this.repo = repo;
	}
	
	// restituisce la lista di tutte le immagini
	@Override
	public Optional<List<Immagine>> listImages() {
		return repo.findAll().orElseThrow(/* RisorsaNonTrovataException */);
	}

	// inserisce l'immagine nella galleria
	@Override
	public void insertImage(String galleryTitle, String imageTitle) {
		Gallery gallery = repo.findByTitle(title);
		Immagine image = new Immagine();
		
		image.setTitle(imageTitle);
		repo.save(image);
	}

}
