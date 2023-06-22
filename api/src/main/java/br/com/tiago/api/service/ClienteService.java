package br.com.tiago.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiago.api.models.Cliente;
import br.com.tiago.api.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}
}
