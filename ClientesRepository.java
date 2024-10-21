package com.exemple.dem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.dem.entities.Clientes;
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}
