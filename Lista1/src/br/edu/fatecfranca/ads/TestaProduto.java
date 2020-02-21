package br.edu.fatecfranca.ads;

import javax.swing.JOptionPane;

public class TestaProduto {

    public static void main(String[] args) {
        // Criando Objetos
        int nid = Integer.parseInt(JOptionPane.showInputDialog("Qual a ID do produto?"));
        int estoq = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade em estoque?"));
        String desc = JOptionPane.showInputDialog("Qual a descrição?");
        float precop = Float.parseFloat(JOptionPane.showInputDialog("Qual o preço deste produto?"));

        Produto obj1 = new Produto(nid, estoq, desc, precop);
        obj1.comprar(7);
        obj1.subir(15);

        nid = Integer.parseInt(JOptionPane.showInputDialog("Qual a ID do produto?"));
        estoq = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade em estoque?"));
        desc = JOptionPane.showInputDialog("Qual a descrição?");
        precop = Float.parseFloat(JOptionPane.showInputDialog("Qual o preço deste produto?"));

        Produto obj2 = new Produto(nid, estoq, desc, precop);
        obj2.vender(4);
        obj2.descer(2);

        JOptionPane.showMessageDialog(null, obj1.mostra());
        JOptionPane.showMessageDialog(null, obj2.mostra());
    }

}
