package com.exemple.dem.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.dem.entities.Produtos;
import com.exemple.dem.repositories.ProdutosRepository;

@Service
public class ProdutosService {
	private final ProdutosRepository produtosRepository;

	@Autowired
	public ProdutosService(ProdutosRepository produtosRepository) {
		this.produtosRepository = produtosRepository;
	}

	// criação do produto
	public Produtos seveProdutos(Produtos produtos) {
		return produtosRepository.save(produtos);
	}

	// buscando o produto:
	public Produtos getProdutosById(Long id) {
		return produtosRepository.findById(id).orElse(null);
	}

	public List<Produtos> getAllProdutos() {
		return produtosRepository.findAll();
	}

	public void deleteProdutos(Long id) {
		produtosRepository.deleteById(id);
	}
}
