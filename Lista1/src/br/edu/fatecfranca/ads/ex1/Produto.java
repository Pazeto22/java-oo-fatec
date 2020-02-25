package br.edu.fatecfranca.ads.ex1;

public class Produto {

    // Variáveis
    private int id;
    private String descricao;
    private int qtde;
    private float preco;

    // Método Construtor 1
    public Produto(int id, String descricao,
            int qtde, float preco) {
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

    public String toString() {
        return "Id: " + this.id
                + "\n Descrição: " + this.descricao
                + "\n Quantidade: " + this.qtde
                + "\n Preço: " + this.preco;
    }
}
