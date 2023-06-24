package br.com.tiago.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiago.api.models.Animal;
import br.com.tiago.api.service.AnimalService;

@RestController
@RequestMapping(value = "/animal")
public class AnimalController {

	@Autowired
	private AnimalService animalService;
	
	@GetMapping
	public List<Animal> buscarTodosAnimais() {
		return animalService.buscarTodosAnimais();
	}
}
