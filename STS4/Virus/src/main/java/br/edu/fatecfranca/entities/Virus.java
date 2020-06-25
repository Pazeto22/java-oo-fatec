package br.edu.fatecfranca.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Relaciona a classe virus com a coleção virus do MongoDB
@Document(collection="virus")
public class Virus {
	
	//@ indica chave única na coleção
	@Id
	private String id;
	private String nome;
	private Float letalidade;
	private String origem;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getLetalidade() {
		return letalidade;
	}
	public void setLetalidade(Float letalidade) {
		this.letalidade = letalidade;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
}
