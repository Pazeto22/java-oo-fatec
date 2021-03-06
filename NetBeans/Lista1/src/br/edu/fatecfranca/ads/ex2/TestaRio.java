package br.edu.fatecfranca.ads.ex2;

import javax.swing.JOptionPane;

public class TestaRio {

    public static void main(String[] args) {
        //Criando Objetos
        String no = JOptionPane.showInputDialog("Qual o nome do rio?");
        float ni = Float.parseFloat(JOptionPane.showInputDialog("Qual o nível do rio?"));
        int aux = JOptionPane.showConfirmDialog(null, "Poluição do rio",
                "O rio está poluído?", JOptionPane.YES_NO_OPTION);
        boolean po = (aux == JOptionPane.YES_OPTION);

        Rio obj1 = new Rio(no, ni, po);
        obj1.chover(10);
        obj1.limpar();

        Rio obj2 = new Rio("Fluído", 30, false);
        obj2.ensolarar(5);
        obj2.sujar();

        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, obj2.toString());
    }

}
