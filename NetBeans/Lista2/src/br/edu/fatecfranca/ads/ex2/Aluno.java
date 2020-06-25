package br.edu.fatecfranca.ads.ex2;

public class Aluno {

    // Variáveis
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    // Método Construtor vazio
    public Aluno() {
        this.numeroAluno = 000000;
        this.nome = "Nome do aluno ainda não definido";
        this.idade = 0;
        this.p1 = 0;
        this.p2 = 0;
    }

    // Método Construtor
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.setNumeroAluno(this.numeroAluno);
        this.setNome(this.nome);
        this.setIdade(this.idade);
        this.setP1(this.p1);
        this.setP2(this.p2);

    }

    //Getters
    public int getNumeroAluno() {
        return this.numeroAluno;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public float getP1() {
        return this.p1;
    }

    public float getP2() {
        return this.p2;
    }

    // Setters
    public void setNumeroAluno(int numeroAluno) {
        if (String.valueOf(numeroAluno).length() == 6) {
            this.numeroAluno = numeroAluno;
        } else {
            System.out.println("Número inválido");
        }
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("O limite máximo de caracteres é 30");
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade deve ser positiva");
        }
    }

    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        } else {
            System.out.println("A nota deve ser positiva");
        }
    }

    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        } else {
            System.out.println("A nota deve ser positiva");
        }
    }

    // Métodos
    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }

    public String toString() {
        return "Número do Aluno: " + this.numeroAluno
                + "\nNome: " + this.nome
                + "\nIdade: " + this.idade
                + "\nNota 1: " + this.p1
                + "\nNota 2: " + this.p2;
    }

    public String passou() {
        if (this.notaFinal() >= 6) {
            return "O aluno" + this.nome + "foi aprovado";
        } else {
            return "O aluno" + this.nome + "foi reprovado";
        }
    }
}
