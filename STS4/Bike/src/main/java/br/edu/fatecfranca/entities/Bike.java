package br.edu.fatecfranca.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Informa que a classe Bike é uma entidade de banco de dados
@Entity
// Informa que a classe bike refere-se a uma tabela bike no banco de dados
@Table(name="bike")
public class Bike {
	
	// Informar que ID é primária
	@Id
	// Informa que a chave é auto incremento
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	//Informar que é uma coluna chamada marca
	@Column(name="marca")
	private String marca;
	@Column(name="modelo")
	private String modelo;
	@Column(name="aro")
	private Integer aro;
	@Column(name="quadro")
	private Float quadro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAro() {
		return aro;
	}
	public void setAro(Integer aro) {
		this.aro = aro;
	}
	public Float getQuadro() {
		return quadro;
	}
	public void setQuadro(Float quadro) {
		this.quadro = quadro;
	}
	

}
