package com.exemple.dem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "serviço")
public class Servico {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String produtoUtilizado;
	private String tipo;
	private String descrição;
	private double preço;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getProdutoUtilizado() {
		return produtoUtilizado;
	}
	public void setProdutoUtilizado(String produtoUtilizado) {
		this.produtoUtilizado = produtoUtilizado;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
}
