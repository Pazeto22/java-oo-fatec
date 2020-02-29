package br.edu.fatecfranca.ads.ex1;

import javax.swing.JOptionPane;

public class teste {

    public static void main(String[] args) {
        Cliente obj1 = new Cliente("201203-9", "4131-3", "Fulano", 300);
        obj1.realizarDeposito(150);
        obj1.realizarSaque(400);

        Cliente obj2 = new Cliente("496408-2", "2867-9", "Beltrano", 1950);
        obj2.realizarDeposito(700);
        obj2.realizarSaque(1300);

        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, obj2.toString());

// Tentar acessar as variáveis sem o método get resulta em erro pois as variáveis
// foram definidas como privadas
//        JOptionPane.showMessageDialog(null, obj1.saldo);;
        JOptionPane.showMessageDialog(null, obj1.getSaldo());

    }

}
