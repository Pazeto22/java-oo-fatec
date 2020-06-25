package br.edu.fatecfranca.ads.prova;

public class teste {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro(300, "SUV Creta", 2020);
        Moto moto1 = new Moto("Cromado", "Sport XL", 2019);
        
        Montadora mont1 = new Montadora();
        mont1.setCnpj("123123123");
        mont1.setNome("Hyundai");
        mont1.addVeiculo(moto1);
        mont1.addVeiculo(carro1);
        
        System.out.println(mont1.toString());
    }
    
}
