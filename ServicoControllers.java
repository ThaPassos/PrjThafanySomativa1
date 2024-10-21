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

import com.exemple.dem.entities.Servico;
import com.exemple.dem.services.ServicoService;

@RestController
@RequestMapping("/serviços")
public class ServicoControllers {
private final ServicoService servicoService;
	
	@Autowired
	public ServicoControllers(ServicoService servicoService) {
		this.servicoService = servicoService;
	}

	@PostMapping
	public Servico createServico(@RequestBody Servico servico) {
		return servicoService.seveServico(servico);
	}

	@GetMapping
	public List<Servico> getAllServico() {
		return servicoService.getAllServico();
	}

	@GetMapping("/{id}")
	public Servico getServico(@PathVariable Long id) {
		return servicoService.getServicoById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteServico(@PathVariable Long id) {

	}
}
