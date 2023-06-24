package br.com.tiago.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiago.api.models.Animal;
import br.com.tiago.api.repositories.AnimalRepository;

@Service
public class AnimalService {

	@Autowired
	private AnimalRepository animalRepository;
	
	public List<Animal> buscarTodosAnimais() {
		return animalRepository.findAll();
	}
}
