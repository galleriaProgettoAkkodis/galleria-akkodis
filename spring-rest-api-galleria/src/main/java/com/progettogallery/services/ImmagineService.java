package com.progettogallery.services;

import java.util.List;
import java.util.Optional;

import com.progettogallery.entities.Immagine;

public interface ImmagineService {
	// lista immagini (GET)
	public List<Immagine> listImages();
		
	public void save(Immagine i);
	
	
	// inserisce immagine nella galleria (POST)
	//public void insertImage(String galleryTitle, long idImage);
}
