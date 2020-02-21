package br.edu.fatecfranca.ads;

public class Produto {

    // Variáveis
    private int id, qtde;
    private String descricao;
    private float preco;

    // Método Construtor 1
    public Produto(int id, int qtde,
            String descricao, float preco) {
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Método Construtor 2
    public Produto() {
    }

    // Métodos
    public void comprar(int x) {
        this.qtde = this.qtde + x;
    }

    public void vender(int x) {
        this.qtde = this.qtde - x;
    }

    public void subir(float x) {
        this.preco = this.preco + x;
    }

    public void descer(float x) {
        this.preco = this.preco - x;
    }

    public String mostra() {
        return "Produto: " + this.id
                + "\n Quantidade: " + this.qtde
                + "\n Descrição: " + this.descricao
                + "\n Preço: " + this.preco;
    }
}
