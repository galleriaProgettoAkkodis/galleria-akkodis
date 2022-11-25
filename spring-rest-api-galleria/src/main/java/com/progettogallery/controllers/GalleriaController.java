package com.progettogallery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.progettogallery.entities.Galleria;
import com.progettogallery.services.GalleriaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/gallery")
public class GalleriaController {

	@Autowired
	private GalleriaService galleryService;
	
	/*Restituisce una lista di titoli delle gallerie presa dal db*/
	@GetMapping("/api")
	public ResponseEntity<List<String>> getListaTitoliGallerie(){
		List<Galleria> listaGallerie = galleryService.listGalleries();
		List<String> listaTitoliGallerie = listaGallerie.stream()
				.map(galleria -> galleria.getTitolo()).toList();
		return new ResponseEntity<>(listaTitoliGallerie, HttpStatus.OK);
	}
	
	/*Aggiunge una galleria con lista immagini vuota*/
	@PostMapping("/api")
	public ResponseEntity<String> addGalleria(@RequestBody String titolo ){
		System.out.println(titolo);
		galleryService.createGallery(titolo);
		return new ResponseEntity<>("Nuova galleria aggiunta", HttpStatus.CREATED);
	}
	
}
