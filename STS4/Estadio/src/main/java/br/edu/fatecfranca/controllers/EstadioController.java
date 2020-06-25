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

import br.edu.fatecfranca.entities.Estadio;

@RestController
@RequestMapping("/api/estadio")
public class EstadioController {

	private ArrayList<Estadio> Estadios = new ArrayList<Estadio>();
	
	@GetMapping
	public ArrayList<Estadio> getEstadios(){
		return this.Estadios;
	}
	
	@PostMapping
	public boolean addEstadio(@RequestBody Estadio Estadio) {
		return this.Estadios.add(Estadio);
	}
	
	@DeleteMapping("/{id}")
	public boolean removeEstadio(@PathVariable("id") int id) {
		for (Estadio Estadio: this.Estadios) {
			if (Estadio.getId() == id) {
				this.Estadios.remove(Estadio);
				return true;
			}
		}
		return false;
	}
	
	@PutMapping
	public boolean atualizaEstadio(@RequestBody Estadio Estadio) {
		for (Estadio x: this.Estadios) {
			if (x.getId() == Estadio.getId()) {
				int pos = this.Estadios.indexOf(x);
				this.Estadios.set(pos, Estadio);
				return true;
			}
		}
		return false;
	}
}
