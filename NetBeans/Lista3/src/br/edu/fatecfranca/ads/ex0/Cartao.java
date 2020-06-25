package br.edu.fatecfranca.ads.ex0;

public class Cartao {

    private int cvv;
    private String validade, bandeira, nro, senha;
    private Conta conta; // Associação

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public boolean sacar(float x, String senha) {
        if (this.senha.equals(senha) && this.conta.getSaldo() >= x) {
            conta.setSaldo(conta.getSaldo() - x);
            return true;
        } else {
            return false;
        }

    }

    public Cartao() {

    }

    @Override
    public String toString() {
        return "Cartao{" + "nro=" + nro + ", cvv=" + cvv + ", validade="
                + validade + ", bandeira=" + bandeira + ", conta=" + conta + '}';
    }

}
