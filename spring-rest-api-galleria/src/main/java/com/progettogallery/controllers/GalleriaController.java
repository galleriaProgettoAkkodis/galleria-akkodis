package com.progettogallery.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/gallery")
public class GalleriaController {

	@GetMapping("/api")
	public ResponseEntity<List<String>> getListaTitoliGallerie(){
		
		return new ResponseEntity<>(listaTitoliGallerie, HttpStatus.OK);
	}
}
