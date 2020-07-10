package br.edu.fatecfranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.entities.Hotel;

public interface HotelRepository extends JpaRepository <Hotel, Long>{

}
