package com.progettogallery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.progettogallery.dto.InsertImage;
import com.progettogallery.entities.Immagine;

@RestController
@CrossOrigin
public class GestioneGalleriaFacade {

	@Autowired
	private ImmagineService immagine;
	@Autowired
	private GalleriaService galleria;
	
	/*Inserisce l'immagine nel db ricevendo titoloImmagine e titoloGalleria*/
	@PostMapping("gallery/api/add")
	public ResponseEntity <Immagine> addImmagine(@RequestBody InsertImage insImg) {
		Immagine img = new Immagine();
		Galleria gallery = new Galleria();
		gallery.setTitolo(insImg.getTitoloGalleria());
		img.setTitolo(insImg.getTitoloImg());
		return new ResponseEntity<>(img, HttpStatus.CREATED);
	}
}
