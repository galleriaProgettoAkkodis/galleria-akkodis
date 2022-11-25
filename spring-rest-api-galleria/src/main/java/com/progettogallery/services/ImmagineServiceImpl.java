package com.progettogallery.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.progettogallery.entities.Galleria;
import com.progettogallery.entities.Immagine;
import com.progettogallery.repo.ImmagineRepo;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class ImmagineServiceImpl implements ImmagineService {
	private ImmagineRepo repo;
	
	// constructor injection 
	public ImmagineServiceImpl(ImmagineRepo repo) {
		this.repo = repo;
	}
	
	// restituisce la lista di tutte le immagini
	@Override
	public List<Immagine> listImages() {
		return repo.findAll();
	}

	@Override
	public void save(Immagine i) {
		repo.save(i);
	}

//	// inserisce l'immagine nella galleria
//	@Override
//	public void insertImage(String galleryTitle, String imageTitle) {
//		Galleria gallery = repo.findByTitolo(galleryTitle);
//		Immagine image = new Immagine();
//		
//		image.setTitolo(imageTitle);
//		repo.save(image);
//	}

}
