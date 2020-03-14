package br.edu.fatecfranca.ads.ex3;

public class Passageiro {

    private String rg;
    private String nome;

    public Passageiro() {

    }

    public Passageiro(String rg, String nome) {
        this.rg = rg;
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "rg=" + rg + ", nome=" + nome + '}';
    }

}
