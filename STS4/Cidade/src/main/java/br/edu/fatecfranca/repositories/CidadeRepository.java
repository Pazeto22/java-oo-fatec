package br.edu.fatecfranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.entities.Cidade;

public interface CidadeRepository extends JpaRepository <Cidade, Long>{

}
