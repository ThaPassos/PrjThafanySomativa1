package com.exemple.dem.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.dem.entities.Servico;
import com.exemple.dem.repositories.ServicoRepository;

@Service
public class ServicoService {
	private final ServicoRepository servicoRepository;

	@Autowired
	public ServicoService(ServicoRepository servicoRepository) {
		this.servicoRepository = servicoRepository;
	}

	// criação do produto
	public Servico seveServico(Servico servico) {
		return servicoRepository.save(servico);
	}

	// buscando o produto:
	public Servico getServicoById(Long id) {
		return servicoRepository.findById(id).orElse(null);
	}

	public List<Servico> getAllServico() {
		return servicoRepository.findAll();
	}

	public void deleteServicoS(Long id) {
		servicoRepository.deleteById(id);
	}
}
