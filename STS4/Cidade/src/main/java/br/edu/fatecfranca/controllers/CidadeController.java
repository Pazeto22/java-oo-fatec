package br.edu.fatecfranca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.entities.Cidade;
import br.edu.fatecfranca.repositories.CidadeRepository;

@RestController
@RequestMapping("/api/cidade")
public class CidadeController {
	
	@Autowired
	CidadeRepository injecao;

	@GetMapping
	public List<Cidade> getCidades(){
		return injecao.findAll();
	}
	
	@PostMapping
	public Cidade addCidade(@RequestBody Cidade cidade) {
		return injecao.save(cidade);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteCidade(@PathVariable Long id) {
		injecao.deleteById(id);
		return true;
	}

	@PutMapping
	public Cidade update(@RequestBody Cidade cidade) {
		return injecao.save(cidade);
	}
	
}
