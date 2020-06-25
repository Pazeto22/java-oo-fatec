package br.edu.fatecfranca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import br.edu.fatecfranca.entities.Banco;
import br.edu.fatecfranca.repositories.BancoRepository;

@RestController
@RequestMapping("/api/banco")
public class BancoController {
	
	@Autowired
	BancoRepository injecao;
	
	
	@GetMapping
	public List<Banco> getBanco() {
		return injecao.findAll();
	}
	
	@PostMapping
	public Banco addBanco(@RequestBody Banco banco) {
		return injecao.save(banco);
	}
	
	@DeleteMapping("/{id}")
	public Boolean deleteBanco(@PathVariable String id) {
		injecao.deleteById(id);
		return true;
	}
	
	@PutMapping
	public Banco updateBanco(@RequestBody Banco banco) {
		return injecao.save(banco);
	}
	

}
