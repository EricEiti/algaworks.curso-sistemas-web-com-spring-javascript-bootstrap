package com.algaworks.brewer.model;

import jakarta.validation.constraints.NotBlank;

public class Cerveja {

	@NotBlank(message = ">>>> tem erro sim!")
	private String sku;
	
	private String nome;
	
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

