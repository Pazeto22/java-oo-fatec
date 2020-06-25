package br.edu.fatecfranca.ads.prova;

import java.util.ArrayList;

public class Montadora {
    private String nome, cnpj;
    // Associação
    private ArrayList<Veiculo> veiculos;
    
    public Montadora (){
        this.veiculos = new ArrayList();
    }
    
    public Montadora(String nome, String cnpj, ArrayList<Veiculo> veiculos){
        this.nome = nome;
        this.cnpj = cnpj;
        this.veiculos = veiculos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }    

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    public void addVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }
    
    public boolean removeVeiculo(Veiculo veiculo){
        return this.veiculos.remove(veiculo);
    }
    
    public int getVeiculo(Veiculo veiculo){
        return this.veiculos.indexOf(nome);
    }
    
    public boolean updateVeiculo(Veiculo atual, Veiculo novo){
        int pos = this.getVeiculo(atual);
        if (pos != -1){
            this.veiculos.set(pos, novo);
            return true;
        } else return false;
    }
    
    @Override
    public String toString(){
        return "\nMontadora { " + "Nome: " + nome + ", CNPJ: " 
                + ", Veículos: " + this.veiculos.toString() + " }";
        //toString vai percorrer cada veiculo no vetor e chamar o toString()
        //POLIMORFISMO
        //SE o veículo for um carro, executa o toString() do carro.
        //SE o veículo for uma moto, executa o toString() da moto.
        //Nesse caso this.veiculos é polimórfico
    }
}
