package br.edu.fatecfranca.ads.ex3;

import java.util.ArrayList;

public class Onibus {

    private int numero;
    private String placa;
    private ArrayList<Passageiro> passageiros;

    public Onibus() {
        passageiros = new ArrayList();
    }

    public Onibus(int numero, String placa) {
        this.numero = numero;
        this.placa = placa;
        this.passageiros = passageiros;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Métodos
    public void addPassenger(Passageiro passageiro) {
        this.passageiros.add(passageiro);
    }

    public boolean removePassenger(Passageiro passageiro) {
        return this.passageiros.remove(passageiro);
    }

    public int getPassenger(Passageiro passageiro) {
        return this.passageiros.indexOf(passageiro);
    }

    public boolean updatePassenger(Passageiro atual, Passageiro nova) {
        int posicao = this.getPassenger(atual);
        if (posicao != -1) {
            this.passageiros.set(posicao, nova);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Onibus{" + "numero=" + numero + ", placa=" + placa + '}';
    }

}
