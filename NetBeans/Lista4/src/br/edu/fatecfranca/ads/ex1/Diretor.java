package br.edu.fatecfranca.ads.ex1;

public class Diretor extends Funcionario{
    private float bonus;
    private String carro;
    
    public Diretor(){
        super();
    }
    
    public Diretor(float bonus, String carro, String nome, float horasTrabalho, float valorHora){
        super(nome, horasTrabalho, valorHora);
        this.bonus = bonus;
        this.carro = carro;
    }
    
    @Override
    public void calculaSalario(){
        super.calculaSalario();
        this.salario = this.salario + this.bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }
    
    @Override
    public String toString(){
        super.toString();
        return "Diretor: {" + "Bônus: " + bonus + ", Carro: " + carro + super.toString() + "}";
    }
}
