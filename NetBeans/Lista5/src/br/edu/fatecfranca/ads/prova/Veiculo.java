package br.edu.fatecfranca.ads.prova;

public abstract class Veiculo {
    private String modelo;
    private int ano;
    
    public Veiculo() {}
    
    public Veiculo(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public String toString(){
        return "\nVeículo { " + "Modelo: " + modelo + ", Ano: " + ano + " ]";
    }
}
