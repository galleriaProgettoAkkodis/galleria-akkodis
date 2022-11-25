package com.progettogallery.dto;

public class InsertImage {
	private String titoloImg;
	private String titoloGalleria;
	private String urlImg;
	public String getTitoloImg() {
		return titoloImg;
	}
	public void setTitoloImg(String titoloImg) {
		this.titoloImg = titoloImg;
	}
	public String getTitoloGalleria() {
		return titoloGalleria;
	}
	public void setTitoloGalleria(String titoloGalleria) {
		this.titoloGalleria = titoloGalleria;
	}
	public InsertImage() {
		super();
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	
}
