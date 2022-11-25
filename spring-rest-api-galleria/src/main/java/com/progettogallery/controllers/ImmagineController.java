package com.progettogallery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progettogallery.entities.Immagine;

@RestController
@CrossOrigin
@RequestMapping("/images")
public class ImmagineController {

	@Autowired
	private ImmagineService immagineService;
	
	
	@GetMapping("/api")
	public ResponseEntity<List<Immagine>> getListaImmagini(){
		List<Immagine> listaImmagini = immagineService.findAll();
		return new ResponseEntity<>(listaImmagini, HttpStatus.OK);
	}

//	@PostMapping("/api/add")
//	public ResponseEntity <Immagine> addImmagine(@RequestBody Immagine img) {
//		
//	}
}
