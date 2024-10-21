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

import com.exemple.dem.entities.Animais;
import com.exemple.dem.services.AnimaisService;
@RestController
@RequestMapping("/animais")
public class AnimaisControllers {
	private final AnimaisService animaisservice;
	
	@Autowired
	public AnimaisControllers(AnimaisService animaisservice) {
		this.animaisservice = animaisservice;
	}

	@PostMapping
	public Animais createAnimais(@RequestBody Animais animais) {
		return animaisservice.seveAnimais(animais);
	}

	@GetMapping
	public List<Animais> getAllAnimais() {
		return animaisservice.getAllAnimais();
	}

	@GetMapping("/{id}")
	public Animais getAnimais(@PathVariable Long id) {
		return animaisservice.getAnimaisById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteAnimais(@PathVariable Long id) {

	}
}
