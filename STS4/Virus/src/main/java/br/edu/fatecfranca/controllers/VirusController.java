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

// Responsavel por lidar com as requisições REST - POST, PUT, DELETE, GET
@RestController
// É responsável por responder através da rota -/api/virus
@RequestMapping("/api/virus")
public class VirusController {
	
	// SPRING --> Injeção de Dependência
	// Utilizar um objeto sem instanciá-lo
	@Autowired
	VirusRepository injecao;
	
	
	@GetMapping // Método responde pela criação GET
	public List<Virus> getVirus() {
		return injecao.findAll();
	}
	
	@PostMapping // Método responde pela requisição POST
	public Virus addVirus(@RequestBody Virus virus) {
		return injecao.save(virus);
	}
	
	@DeleteMapping("/{id}") // Método responde pela requisição DELETE
	public Boolean deleteVirus(@PathVariable String id) {
		injecao.deleteById(id);
		return true;
	}
	
	@PutMapping // Método responde pela requisição PUT
	public Virus updateVirus(@RequestBody Virus virus) {
		// Se o virus já tiver id, ele atualiza automaticamente
		return injecao.save(virus);
	}
	

}
