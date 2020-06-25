package br.edu.fatecfranca.ads.ex1;

public class Produto {

    // Variáveis
    private int id;
    private String descricao;
    private int qtde;
    private float preco;

    // Método Construtor 1
    public Produto() {
    }

    // Método Construtor 2
    public Produto(int id, String descricao,
            int qtde, float preco) {
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.setPreco(preco);
    }

    // Setters
    public void setPreco(float preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser vazio");
        }
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getters
    public float getPreco() {
        return this.preco;
    }

    public int getQtde() {
        return this.qtde;
    }

    public int getId() {
        return this.id;
    }

    public String getDescricao() {
        return this.descricao;
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
        this.setPreco(this.preco - x);
    }

    public String toString() {
        return "Id: " + this.id
                + "\n Descrição: " + this.descricao
                + "\n Quantidade: " + this.qtde
                + "\n Preço: " + this.preco;
    }
}
