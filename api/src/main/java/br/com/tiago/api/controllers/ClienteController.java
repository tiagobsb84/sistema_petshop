package br.com.tiago.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiago.api.models.Cliente;
import br.com.tiago.api.service.ClienteService;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> findAll() {
		return clienteService.findAll();
	}
}
