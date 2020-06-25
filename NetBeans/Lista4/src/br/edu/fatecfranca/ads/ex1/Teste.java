package br.edu.fatecfranca.ads.ex1;

public class Teste {
    
    public static void calculaSalarioMostra(Funcionario camaleao){ //Polimorfismo, é necessário ter anulação de método
        camaleao.calculaSalario(); // Executa o rolê de quem for passado como parâmetro
        System.out.println(camaleao.toString());
    }

    public static void main(String[] args) {
        
        Gerente g1 = new Gerente(3000, "Carlos", 40, 50);
        calculaSalarioMostra(g1);
        
        Diretor d1 = new Diretor(5000, "Civic", "Marcos", 40, 70);
        calculaSalarioMostra(d1);    
        
        Departamento dep1 = new Departamento();
        dep1.setNome("Tecnologia");
        dep1.setSetor("Software");
        dep1.addFuncionario(d1);
        dep1.addFuncionario(g1);
        
        System.out.println(dep1.toString());
    }
    
}