package com.exemple.dem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.dem.entities.Produtos;
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

}
