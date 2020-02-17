package br.edu.fatecfranca.ads;

import javax.swing.JOptionPane;

public class Teste {
    
    public static void main(String[] args) {
        // Criando objetos
        String mo = JOptionPane.showInputDialog("Informe o Modelo");
        String ma = JOptionPane.showInputDialog("Informe a Marca");
        int aux =  JOptionPane.showConfirmDialog(null,
                "Está ligado?", "Está ligado?", JOptionPane.YES_NO_OPTION);
        boolean mt = (aux == JOptionPane.YES_OPTION);
        float va = Float.parseFloat(JOptionPane.showInputDialog("Informe a Velocidade Atual"));
        
        Carro obj1 = new Carro(mo, ma, mt, va);
        obj1.ligar();
        obj1.acelerar(70);
        
        mo = JOptionPane.showInputDialog("Informe o Modelo");
        ma = JOptionPane.showInputDialog("Informe a Marca");
        aux =  JOptionPane.showConfirmDialog(null,
                "Está ligado?", "O Motor está ligado?", JOptionPane.YES_NO_OPTION);
        mt = (aux == JOptionPane.YES_OPTION);
        va = Float.parseFloat(JOptionPane.showInputDialog("Informe a Velocidade Atual"));
        
        Carro obj2 = new Carro(mo, ma, mt, va);
        obj2.desligar();
        obj2.frear(30);
        
        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, obj2.toString());
    }
    
}