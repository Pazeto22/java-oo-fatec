package br.edu.fatecfranca.ads.ex1;

public class Gerente extends Funcionario {
    private float comissao;

    public Gerente(){
        super();
    }
    
    public Gerente(float comissao, String nome, float horasTrabalho, float valorHora){
        super(nome, horasTrabalho, valorHora);
        this.comissao = comissao;
    }
    
    @Override
    public void calculaSalario(){
        super.calculaSalario();
        this.salario = this.salario + this.comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
    @Override
    public String toString(){
        super.toString();
        return "Gerente{" + "Comissão: " + comissao +super.toString() + '}';
    }    
}
