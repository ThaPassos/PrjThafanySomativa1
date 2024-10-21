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

import com.exemple.dem.entities.Agendamento;
import com.exemple.dem.services.AgendamentoService;
@RestController
@RequestMapping("/agendamento")
public class AgendamentoControllers {
private final AgendamentoService agendamentoservice;
	
	@Autowired
	public AgendamentoControllers(AgendamentoService agendamentoservice) {
		this.agendamentoservice = agendamentoservice;
	}

	@PostMapping
	public Agendamento createAgendamento(@RequestBody Agendamento agendamento) {
		return agendamentoservice.seveAgendamento(agendamento);
	}

	@GetMapping
	public List<Agendamento> getAllAgendamento() {
		return agendamentoservice.getAllAgendamento();
	}

	@GetMapping("/{id}")
	public Agendamento getAgendamento(@PathVariable Long id) {
		return agendamentoservice.getAgendamentoById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteAgendamento(@PathVariable Long id) {

	}
}
