package br.edu.fatecfranca.ads.ex1;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private String setor;
    private ArrayList<Funcionario> funcionarios;
        
    public Departamento(){
        super();
        funcionarios = new ArrayList();
    }
    
    public Departamento(String nome, String setor, ArrayList<Funcionario> funcionarios){
        this.nome = nome;
        this.setor = setor;
        this.funcionarios = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addFuncionario(Funcionario funcionario){
        this.getFuncionarios().add(funcionario);
    }
    
    @Override
    public String toString(){
        return "Departamento: {" + "Nome: " + getNome() + ", Setor: " + getSetor() + ", Funcionários: " + getFuncionarios() + "}";
    }
    
}
