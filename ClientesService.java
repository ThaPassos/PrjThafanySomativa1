package com.exemple.dem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.dem.entities.Clientes;
import com.exemple.dem.repositories.ClientesRepository;

@Service
public class ClientesService {
	private final ClientesRepository clientesrepository;

	@Autowired
	public ClientesService(ClientesRepository clientesrepository) {
		this.clientesrepository = clientesrepository;
	}

	// criação do produto
	public Clientes seveClientes(Clientes clientes) {
		return clientesrepository.save(clientes);
	}

	// buscando o produto:
	public Clientes getClientesById(Long id) {
		return clientesrepository.findById(id).orElse(null);
	}

	public List<Clientes> getAllClientes() {
		return clientesrepository.findAll();
	}

	public void deleteClientes(Long id) {
		clientesrepository.deleteById(id);
	}

}

