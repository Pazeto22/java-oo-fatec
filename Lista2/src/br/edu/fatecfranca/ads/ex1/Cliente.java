package br.edu.fatecfranca.ads.ex1;

public class Cliente {

    // Variáveis
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    // Método Construtor Vazio
    public Cliente() {
        this.numeroConta = "Número da conta inexistente";
        this.numeroAgencia = "Número da agência inexistente";
        this.nome = "Nome inexistente";
        this.saldo = 0;
    }

    // Método Construtor
    public Cliente(String numeroConta, String numeroAgencia,
            String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    // Setters
    public void setNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8 && numeroConta.indexOf("-") == 6) {
            this.numeroConta = numeroConta;
        } else {
            System.out.println("Número de conta inválido");
        }
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length() == 6 && numeroAgencia.indexOf("-") == 4) {
            this.numeroAgencia = numeroAgencia;
        } else {
            System.out.println("Número de agência inválido");
        }
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("Nome não pode ultrapassar 30 caractéres");
        }
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser inexistente");
        }
    }

    // Getters
    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSaldo() {
        return this.saldo;
    }

    // Métodos
    public void realizarDeposito(float x) {
        setSaldo(this.saldo + x);
    }

    public void realizarSaque(float x) {
        setSaldo(this.saldo - x);
    }

    public String toString() {
        return "Número da Conta: " + this.numeroConta
                + "\n Número da Agência: " + this.numeroAgencia
                + "\n Nome do Cliente: " + this.nome
                + "\n Saldo: " + this.saldo;
    }
}
