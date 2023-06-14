package br.com.tiago.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiago.api.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
