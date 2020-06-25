package br.edu.fatecfranca.ads.ex2;

import java.util.Date;

public class teste {

    public static void main(String[] args) {
        Remedio rem1 = new Remedio("Neosaldina", "Takeda", new Date());
        Remedio rem2 = new Remedio("Oldsaldina", "Daketa", new Date());
        
        Farmacia far1 = new Farmacia();
        far1.setNome("Farmaçona");
        far1.setCnpj("6419648964");
        far1.addRemedio(rem1); // Testa ADD
        far1.addRemedio(rem2); // Testa ADD
        
        System.out.println(far1.toString());
        System.out.println(far1.getRemedio(rem2)); // Testa GET
        
        far1.removeRemedio(rem1); // Testa REMOVE
        
        System.out.println(far1.toString());
        System.out.println(far1.getRemedio(rem2)); // Testa GET
        
        Remedio rem3 = new Remedio();
        rem3.setNome("Anothersaldina");
        rem3.setMarca("Ketada");
        rem3.setValidade(new Date());
        
        far1.updateRemedio(rem2, rem3); // Testa UPDATE
        
        System.out.println(far1.toString());
    }
    
}
