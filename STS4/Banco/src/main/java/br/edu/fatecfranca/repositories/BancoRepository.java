package br.edu.fatecfranca.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.edu.fatecfranca.entities.Banco;

public interface BancoRepository extends MongoRepository <Banco, String>{

}
