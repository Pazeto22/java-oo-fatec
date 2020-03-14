package br.edu.fatecfranca.ads.ex0;

import javax.swing.JOptionPane;

public class Conta {
    private String nro, agencia, nome;
    private float saldo;

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(this.saldo >= 0) {
            this.saldo = saldo;
        } else {
            JOptionPane.showMessageDialog(null, "Sem saldo suficiente");
        }
    }

    public Conta() {
        this.nro = "000000";
        this.agencia = "000000";
        this.nome = "Pedras";
        this.saldo = 0;
    }

    @Override
    public String toString() {
        return "Conta{" + "nro=" + nro + ", agencia=" + agencia + ", nome=" + nome + ", saldo=" + saldo + '}';
    }
    
    
}