package com.exemple.dem.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.dem.entities.Agendamento;
import com.exemple.dem.repositories.AgendamentoRepository;

@Service
public class AgendamentoService {
	private final AgendamentoRepository agendamentorepository;

	@Autowired
	public AgendamentoService(AgendamentoRepository agendamentorepository) {
		this.agendamentorepository = agendamentorepository;
	}

	// criação do produto
	public Agendamento seveAgendamento(Agendamento agendamento) {
		return agendamentorepository.save(agendamento);
	}

	// buscando o produto:
	public Agendamento getAgendamentoById(Long id) {
		return agendamentorepository.findById(id).orElse(null);
	}

	public List<Agendamento> getAllAgendamento() {
		return agendamentorepository.findAll();
	}

	public void deleteAgendamento(Long id) {
		agendamentorepository.deleteById(id);
	}
}
