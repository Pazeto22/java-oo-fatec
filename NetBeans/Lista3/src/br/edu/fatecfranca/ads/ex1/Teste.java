package br.edu.fatecfranca.ads.ex1;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        Passageiro peter = new Passageiro("Bruce Wayne", "89394644380");
        Voo voo370 = new Voo("370", "Inferno");
//        Reserva reserva = new Reserva(1, new Date(), peter, voo370);
        
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2018);
        c.set(Calendar.MONTH, Calendar.MARCH);
        c.set(Calendar.DAY_OF_MONTH, 20);
        
        Reserva reserva = new Reserva();
        reserva.setCodigo (432);
        reserva.setDate(c.getTime());
        reserva.setPassageiro(peter);
        reserva.setVoo(voo370);
        
        JOptionPane.showMessageDialog(null, reserva.toString());
        
    }

}