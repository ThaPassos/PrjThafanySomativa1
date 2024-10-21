package com.exemple.dem.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.dem.entities.Animais;
import com.exemple.dem.repositories.AniamisRepository;

@Service
public class AnimaisService {
	private final AniamisRepository animaisrepository;

	@Autowired
	public AnimaisService(AniamisRepository animaisrepository) {
		this.animaisrepository = animaisrepository;
	}

	// criação do produto
	public Animais seveAnimais(Animais animais) {
		return animaisrepository.save(animais);
	}

	// buscando o produto:
	public Animais getAnimaisById(Long id) {
		return animaisrepository.findById(id).orElse(null);
	}

	public List<Animais> getAllAnimais() {
		return animaisrepository.findAll();
	}

	public void deleteAnimais(Long id) {
		animaisrepository.deleteById(id);
	}

}
