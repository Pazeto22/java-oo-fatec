package br.edu.fatecfranca.ads.ex1;

public abstract class Funcionario {
    protected float salario;
    protected String nome;
    protected float horasTrabalho;
    protected float valorHora;
    
    public Funcionario(){
        
    }
    
    public Funcionario(String nome, 
            float horasTrabalho, float valorHora){
        this.nome = nome;
        this.horasTrabalho = horasTrabalho;
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    private void setSalario(float salario) { // Sendo private, nem as classes filhas herdarão
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(float horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
    @Override
    public String toString() {
        return "\nFuncionário{" + "salario: " + salario + ", nome: " + nome + 
                ", Horas Trabalhadas: " + horasTrabalho + ", Valor da Hora: " 
                + valorHora + '}';
    }
    
    public void calculaSalario(){
        this.setSalario(this.horasTrabalho * this.valorHora);
    }
   
    
    
}
