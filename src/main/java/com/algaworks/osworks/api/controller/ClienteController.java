package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setName("João");
		cliente1.setTelefone("91 99999-1111");
		cliente1.setEmail("joão@algaworks.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setName("Maria");
		cliente2.setTelefone("34 77777-1111");
		cliente2.setEmail("maria@algaworks.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
