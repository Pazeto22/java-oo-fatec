package br.edu.fatecfranca.ads.ex0;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        Conta objParte = new Conta();
        objParte.setAgencia("3069");
        objParte.setNome("Pedro");
        objParte.setNro("123-4");
        objParte.setSaldo(3000);

        Cartao objTodo = new Cartao();
        objTodo.setBandeira("Shicazyrus");
        objTodo.setCvv(666);
        objTodo.setNro("11111111111111111");
        objTodo.setValidade("10/20");
        objTodo.setSenha("123456");

        // Associação da agregação
        objTodo.setConta(objParte);

        JOptionPane.showMessageDialog(null, objTodo.toString());

        JOptionPane.showMessageDialog(null, ((objTodo.sacar(2500, "123456"))
                ? "Sacado com sucesso" : "Saque não realizado"));
    }

}