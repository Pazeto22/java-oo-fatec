package br.edu.fatecfranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.entities.Bike;

// a interface vai herdar da classe JpaRepository (Nesta, está tudo pronto)
// com um objeto desta interface, poderemos fazer CRUD da bike
public interface BikeRepository extends JpaRepository <Bike, Long>{

}
