package com.progettogallery.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GestoreGlobaleExceptions {
	
	@ExceptionHandler(RisorsaNonTrovataException.class)
	public ResponseEntity<MessaggioErrore> gestoreRisorsaNonTrovata(RisorsaNonTrovataException ex, WebRequest request){
		MessaggioErrore errore = new MessaggioErrore();
		errore.setTimeStamp(new Date());
		errore.setStatus(HttpStatus.NOT_FOUND.value());
		errore.setError(HttpStatus.NOT_FOUND.name());
		errore.setMessages(ex.getMessage());
		errore.setPathUri(request.getDescription(false));
		return new ResponseEntity<>(errore, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MessaggioErrore> gestoreDatiNonValidi (MethodArgumentNotValidException ex, WebRequest request){
		MessaggioErrore errore = new MessaggioErrore();
		errore.setTimeStamp(new Date());
		errore.setStatus(HttpStatus.NOT_FOUND.value());
		errore.setError(HttpStatus.NOT_FOUND.name());
		errore.setMessages(ex.getMessage());
		errore.setPathUri(request.getDescription(false));
		return new ResponseEntity<>(errore, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> gestoreEccezioneNonIdentificata(Exception ex){
		return new ResponseEntity<>("errore generico", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}