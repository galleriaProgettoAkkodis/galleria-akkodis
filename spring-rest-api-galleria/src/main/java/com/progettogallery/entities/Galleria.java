package com.progettogallery.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Galleria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "titolo non puÃ² essere null o vuoto")
	@Column(nullable = false, unique = true)
	private String titolo;
	
	@JsonIgnore
	@OneToMany(mappedBy = "galleria")
	private List<Immagine> immagini;
	
	public Galleria() {}

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

	public List<Immagine> getImmagini() {
		return immagini;
	}

	public void setImmagini(List<Immagine> immagini) {
		this.immagini = immagini;
	}

	@Override
	public String toString() {
		return "Galleria [id=" + id + ", titolo=" + titolo + ", immagini=" + immagini + "]";
	}
	
	
}