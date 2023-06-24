package br.com.tiago.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiago.api.models.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
