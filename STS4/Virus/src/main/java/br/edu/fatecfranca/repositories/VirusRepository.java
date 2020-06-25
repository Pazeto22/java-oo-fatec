package br.edu.fatecfranca.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.edu.fatecfranca.entities.Virus;

// a interface herda a classe MongoRepository
// String é o tipo da chave da classe Virus
// Virus é a classe que vai ser manipulada com CRUD
public interface VirusRepository extends MongoRepository <Virus, String>{
	//Essa classe herda todos os métodos de CRUD já relacionados com a classe Virus

}
