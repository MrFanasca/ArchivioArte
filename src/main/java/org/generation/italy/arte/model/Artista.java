package org.generation.italy.arte.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Artista {

	/*************/
	// ATTRIBUTI //
	/*************/
	@Id
	@Column (nullable=false, length=50)
	private String nominativo;
	
	@Column (nullable=false, length=20)
	private String nazionalita;
	
	@Column (nullable=false, length=20)
	private Date dataDiNascita;

	@OneToMany (mappedBy = "artista")
	List<Opera> elencoOpera;
	
	/***************/
	// COSTRUTTORI //
	/***************/
	public Artista() {
		super();
	}

	public Artista(String nominativo, String nazionalita, Date dataDiNascita) {
		super();
		this.nominativo = nominativo;
		this.nazionalita = nazionalita;
		this.dataDiNascita = dataDiNascita;
	}

	/*******************/
	// GETTER E SETTER //
	/*******************/
	public String getNominativo() {
		return nominativo;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public List<Opera> getElencoOpera() {
		return elencoOpera;
	}
	
	
}
