package br.edu.fatecfranca.ads.ex3;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        Passageiro p1 = new Passageiro("978974984", "Ricardo");
        Passageiro p2 = new Passageiro("654654561", "José");
        Passageiro p3 = new Passageiro("416516478", "Clara");
        Passageiro p4 = new Passageiro("231564987", "Joana");

        Onibus o1 = new Onibus();
        Onibus o2 = new Onibus();

        o1.setNumero(1);
        o1.setPlaca("321abc");
        o2.setNumero(2);
        o2.setPlaca("456gfr");

        o1.addPassenger(p2);
        o2.addPassenger(p3);
        o2.addPassenger(p1);
        o1.addPassenger(p4);

        Rodoviaria r1 = new Rodoviaria();

        r1.setNome("José Celeste");
        r1.setCidade("Corona City");

        JOptionPane.showMessageDialog(null, r1.toString());
        
        r1.removeBus(o1);
        
        JOptionPane.showMessageDialog(null, r1.toString());

    }

}
