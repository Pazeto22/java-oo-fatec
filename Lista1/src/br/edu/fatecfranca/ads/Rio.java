package br.edu.fatecfranca.ads;

public class Rio {

    // Variáveis
    private String nome;
    private float nivel;
    private boolean poluido;

    // Método Construtor
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    // Método Construtor 2
    public Rio() {
    }

    // Métodos
    public void chover(float x) {
        this.nivel = this.nivel + x;
    }

    public void ensolarar(float x) {
        this.nivel = this.nivel + x;
    }

    public void limpar() {
        this.poluido = false;
    }

    public void sujar() {
        this.poluido = true;
    }

    public String mostra() {
        return "Rio: " + this.nome
                + "\n Nível: " + this.nivel
                + "\n Poluído: " + this.poluido;
    }
}
