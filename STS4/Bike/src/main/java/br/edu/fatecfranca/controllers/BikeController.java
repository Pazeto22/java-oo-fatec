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

import br.edu.fatecfranca.entities.Bike;
import br.edu.fatecfranca.repositories.BikeRepository;

// Informa que a classe responde requisição RESTFULL
@RestController
// Informa que a classe responde através da rota /api/bike
@RequestMapping("/api/bike")
public class BikeController {
	
	// cria o objeto de injeção de dependência
	@Autowired
	BikeRepository injecao;

	@GetMapping
	public List<Bike> getBikes(){
		return injecao.findAll();
	}
	
	@PostMapping
	public Bike addBike(@RequestBody Bike bike) {
		return injecao.save(bike);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteBike(@PathVariable Long id) {
		injecao.deleteById(id);
		return true;
	}

	@PutMapping
	public Bike update(@RequestBody Bike bike) {
		return injecao.save(bike); // vai atualizar porque bike tem id
	}
	
}
