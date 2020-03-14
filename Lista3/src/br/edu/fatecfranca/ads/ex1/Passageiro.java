package br.edu.fatecfranca.ads.ex1;

public class Passageiro {
    private String nome, cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Passageiro() {
        this.nome = "Pedra";
        this.cpf = "12345678909";
    }

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
    
    
}