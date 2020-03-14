package br.edu.fatecfranca.ads.ex3;

import java.util.ArrayList;

public class Rodoviaria {

    private String nome;
    private String cidade;
    private ArrayList<Onibus> onibusnoplural;

    public Rodoviaria() {
        onibusnoplural = new ArrayList();
    }

    public Rodoviaria(String nome, String cidade, ArrayList<Onibus> onibusnoplural) {
        this.nome = nome;
        this.cidade = cidade;
        this.onibusnoplural = onibusnoplural;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Onibus> getOnibusnoplural() {
        return onibusnoplural;
    }

    public void setOnibusnoplural(ArrayList<Onibus> onibusnoplural) {
        this.onibusnoplural = onibusnoplural;
    }

    // Métodos
    public void addBus(Onibus onibus) {
        this.onibusnoplural.add(onibus);
    }

    public boolean removeBus(Onibus onibus) {
        return this.onibusnoplural.remove(onibus);
    }

    public int getBus(Onibus onibus) {
        return this.onibusnoplural.indexOf(onibus);
    }

    public boolean updateBus(Onibus atual, Onibus novo) {
        int posicao = this.getBus(atual);
        if (posicao != -1) {
            this.onibusnoplural.set(posicao, novo);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Rodoviaria{" + "nome=" + nome + ", cidade=" + cidade + ", onibusnoplural=" + onibusnoplural + '}';
    }

}
