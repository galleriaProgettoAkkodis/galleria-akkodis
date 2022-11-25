package com.progettogallery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.progettogallery.entities.Galleria;

@RestController
@CrossOrigin
@RequestMapping("/gallery")
public class GalleriaController {

	@Autowired
	private GalleriaService galleryService;
	
	@GetMapping("/api")
	public ResponseEntity<List<String>> getListaTitoliGallerie(){
		List<Galleria> listaGallerie = galleryService.findAll();
		List<String> listaTitoliGallerie = listaGallerie.stream()
				.map(galleria -> galleria.getTitolo()).toList();
		return new ResponseEntity<>(listaTitoliGallerie, HttpStatus.OK);
	}
	
	@PostMapping("/api")
	public ResponseEntity<Galleria> getListaTitoliGallerie(@RequestAttribute String titolo ){
		Galleria gallery = new Galleria();
		gallery.setTitolo(titolo);
		galleryService.save(gallery);
		return new ResponseEntity<>(gallery, HttpStatus.CREATED);
	}
	
}
