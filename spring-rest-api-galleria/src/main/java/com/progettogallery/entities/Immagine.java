package com.progettogallery.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Immagine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "titolo non può essere null o vuoto")
	@Column(nullable = false)
	private String titolo;
	
	@NotBlank(message = "url non può essere null o vuoto")
	@Column(nullable = false)
	private String url;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Galleria galleria;
	
	public Galleria getGalleria() {
		return galleria;
	}

	public void setGalleria(Galleria galleria) {
		this.galleria = galleria;
	}

	public Immagine() {}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Immagine [id=" + id + ", titolo=" + titolo + ", url=" + url + "]";
	}
	
	
}