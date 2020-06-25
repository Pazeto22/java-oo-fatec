package br.edu.fatecfranca.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="banco")
public class Banco {
	
	@Id
	private int id;
	private String nroBanco;
	private String nomeBanco;
	private int qtdeAgencia;
	private float lucro;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNroBanco() {
		return nroBanco;
	}
	public void setNroBanco(String nroBanco) {
		this.nroBanco = nroBanco;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public int getQtdeAgencia() {
		return qtdeAgencia;
	}
	public void setQtdeAgencia(int qtdeAgencia) {
		this.qtdeAgencia = qtdeAgencia;
	}
	public float getLucro() {
		return lucro;
	}
	public void setLucro(float lucro) {
		this.lucro = lucro;
	}
	
	
	
	
}
