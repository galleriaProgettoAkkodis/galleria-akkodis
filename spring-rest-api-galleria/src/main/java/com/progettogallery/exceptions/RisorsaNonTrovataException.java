package com.progettogallery.exceptions;

public class RisorsaNonTrovataException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public RisorsaNonTrovataException(String msg) {
		super(msg);
	}
}
