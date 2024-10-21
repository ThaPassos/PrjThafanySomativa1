package com.exemple.dem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "produtos")
public class Produtos {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipo;
	private String nome;
	private String função;
	private double preço;
	private int quantidadeEmEstoque;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFunção() {
		return função;
	}
	public void setFunção(String função) {
		this.função = função;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
}
