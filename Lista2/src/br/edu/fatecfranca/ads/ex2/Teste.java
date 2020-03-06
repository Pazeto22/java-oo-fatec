package br.edu.fatecfranca.ads.ex2;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        Aluno obj1 = new Aluno(345192, "Ricardo", 16, 7, 8);
        obj1.notaFinal();

        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, obj1.passou());

        // Tentar acessar as variáveis sem o método get resulta em erro pois as variáveis
        // foram definidas como privadas
//        Errado \/
//        JOptionPane.showMessageDialog(null, obj1.nome);
//        Certo \/
//        JOptionPane.showMessageDialog(null, obj1.getNome());
    }
}
