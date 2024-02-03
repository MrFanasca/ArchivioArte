package org.generation.italy.arte.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Opera {

	/*************/
	// ATTRIBUTI //
	/*************/
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column (nullable=false, length=30)
	private String titolo;
	
	@Column (nullable=false, length=4)
	private int anno;
	
	@Column (nullable=false, length=20)
	private String tipologia;
	
	@ManyToOne (optional=false)
	private Artista artista;

	/***************/
	// COSTRUTTORI //
	/***************/
	public Opera() {
		super();
	}

	public Opera(int id, String titolo, int anno, String tipologia, Artista artista) {
		super();
		Id = id;
		this.titolo = titolo;
		this.anno = anno;
		this.tipologia = tipologia;
		this.artista = artista;
	}
	
	/*******************/
	// GETTER E SETTER //
	/*******************/	
	public int getId() {
		return Id;
	}

	public String getTitolo() {
		return titolo;
	}

	public int getAnno() {
		return anno;
	}

	public String getTipologia() {
		return tipologia;
	}

	public Artista getArtista() {
		return artista;
	}
}
