package br.edu.fatecfranca.ads.ex1;

import java.util.Date;

public class Reserva {

    private int codigo;
    private Date date;
    private Passageiro passageiro;
    private Voo voo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Reserva() {
        this.codigo = 0;
        this.date = new Date();
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Reserva(int codigo, Date date, Passageiro passageiro, Voo voo) {
        this.codigo = codigo;
        this.date = date;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "codigo=" + codigo + ", date=" + date + ", passageiro=" + passageiro + ", voo=" + voo + '}';
    }
    
}