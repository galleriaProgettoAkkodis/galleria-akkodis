package com.progettogallery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.progettogallery.entities.Immagine;

@RestController
@CrossOrigin
public class GestioneGalleriaFacade {

	@Autowired
	private ImmagineService immagine;
	@Autowired
	private GalleriaService galleria;
	
//	@PostMapping("gallery/api/add")
//	public ResponseEntity <Immagine> addImmagine(@RequestBody Immagine img) {
//		
//	}
}
