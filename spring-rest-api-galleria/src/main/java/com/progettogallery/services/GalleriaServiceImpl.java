package com.progettogallery.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.progettogallery.entities.Galleria;
import com.progettogallery.exceptions.RisorsaNonTrovataException;
import com.progettogallery.repo.GalleriaRepo;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class GalleriaServiceImpl implements GalleriaService {
	private GalleriaRepo repo;
	
	public GalleriaServiceImpl(GalleriaRepo repo) {
		this.repo = repo;
	}
	
	// restituisce la lista di tutte le gallerie
	@Override
	public List<Galleria> listGalleries() {
		return repo.findAll();
	}

	// crea una galleria con il titolo
	@Override
	public void createGallery(String title) {
		Galleria gallery = new Galleria();
		gallery.setTitolo(title);
		repo.save(gallery);
	}

	@Override
	public void save(Galleria g) {
		repo.save(g);
	}

	@Override
	public Galleria findByTitolo(String titolo) {
		return repo.findByTitolo(titolo).orElseThrow(()-> new RisorsaNonTrovataException("Nessuna galleria con titolo:" + titolo));
	}

}
