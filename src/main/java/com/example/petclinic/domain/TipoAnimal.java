package com.example.petclinic.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class TipoAnimal {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoAnimal")
	private Set<Raca> racas;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Set<Raca> getRacas() {
		return racas;
	}

	public void setRacas(Set<Raca> racas) {
		this.racas = racas;
	}
	
}