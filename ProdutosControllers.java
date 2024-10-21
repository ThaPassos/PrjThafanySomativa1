package com.exemple.dem.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.dem.entities.Produtos;
import com.exemple.dem.services.ProdutosService;

@RestController
@RequestMapping("/produtos")
public class ProdutosControllers {
private final ProdutosService produtosservice;
	
	@Autowired
	public ProdutosControllers(ProdutosService produtosservice) {
		this.produtosservice = produtosservice;
	}

	@PostMapping
	public Produtos createProdutos(@RequestBody Produtos produtos) {
		return produtosservice.seveProdutos(produtos);
	}

	@GetMapping
	public List<Produtos> getAllProdutos() {
		return produtosservice.getAllProdutos();
	}

	@GetMapping("/{id}")
	public Produtos getProdutos(@PathVariable Long id) {
		return produtosservice.getProdutosById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteProdutos(@PathVariable Long id) {

	}
}
