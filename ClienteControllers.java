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

import com.exemple.dem.entities.Clientes;
import com.exemple.dem.services.ClientesService;

@RestController
@RequestMapping("/clientes")
public class ClienteControllers {
	
	private final ClientesService clientesservice;
	
	@Autowired
	public ClienteControllers(ClientesService clientesservice) {
		this.clientesservice = clientesservice;
	}

	@PostMapping
	public Clientes createClientes(@RequestBody Clientes clientes) {
		return clientesservice.seveClientes(clientes);
	}

	@GetMapping
	public List<Clientes> getAllClientes() {
		return clientesservice.getAllClientes();
	}

	@GetMapping("/{id}")
	public Clientes getClientes(@PathVariable Long id) {
		return clientesservice.getClientesById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteClientes(@PathVariable Long id) {

	}

}
