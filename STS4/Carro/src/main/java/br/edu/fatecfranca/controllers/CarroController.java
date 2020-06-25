package br.edu.fatecfranca.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.entities.Carro;

@RestController //Esta classe é um controle de requisições REST
@RequestMapping("/api/carro") // Apenas vai controlar a rota "/api/carro"
public class CarroController {

	private ArrayList<Carro> carros = new ArrayList<Carro>();
	
	@GetMapping // Executa quando o método for GET
	public ArrayList<Carro> getCarros(){
		return this.carros;
	}
	
	@PostMapping // Executa quando o método for POST
	// @RequestBody informações do carro no body do form
	public boolean addCarro(@RequestBody Carro carro) {
		return this.carros.add(carro);
	}
	
	@DeleteMapping("/{id}")
	public boolean removeCarro(@PathVariable("id") int id) {
		for (Carro carro: this.carros) {
			if (carro.getId() == id) {
				this.carros.remove(carro);
				return true;
			}
		}
		return false; // Não remove
	}
	
	@PutMapping
	public boolean atualizaCarro(@RequestBody Carro carro) {
		for (Carro x: this.carros) {
			if (x.getId() == carro.getId()) {
				int pos = this.carros.indexOf(x);
				this.carros.set(pos, carro);
				return true; // Atualizou
			}
		}
		return false; // Não atualizou	
	}
}
