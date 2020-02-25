package br.edu.fatecfranca.ads.ex1;

import javax.swing.JOptionPane;

public class TestaProduto {

    public static void main(String[] args) {
        // Criando Objetos
        int nid = Integer.parseInt(JOptionPane.showInputDialog(
                "Qual a ID do produto?"));
        String desc = JOptionPane.showInputDialog(
                "Qual a descrição?");
        int estoq = Integer.parseInt(JOptionPane.showInputDialog(
                "Qual a quantidade em estoque?"));
        float precop = Float.parseFloat(JOptionPane.showInputDialog(
                "Qual o preço deste produto?"));

        Produto obj1 = new Produto(nid, desc, estoq, precop);
        obj1.comprar(7);
        obj1.subir(15);

        Produto obj2 = new Produto(2237, "Suco Natural", 30, 4);
        obj2.vender(4);
        obj2.descer(2);

        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, obj2.toString());
    }

}
