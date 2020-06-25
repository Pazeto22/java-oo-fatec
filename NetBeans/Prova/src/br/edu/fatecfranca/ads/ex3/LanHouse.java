package br.edu.fatecfranca.ads.ex3;

import java.util.ArrayList;

public class LanHouse {
    private ArrayList<Computador> micros;
    
    public LanHouse(){
        this.micros = new ArrayList();
    }
    
    public LanHouse(ArrayList<Computador> micros){
        this.micros = micros;
    }
    
    public void addComputador(Computador computador){
        this.micros.add(computador);
    }
    
    @Override
    public String toString(){
        return "\nLanHouse { " + "Computadores: " + this.micros.toString() + " }";
        //POLIMORFISMO
        //Se o computador for um desktop, executa o toString() do desktop.
        //Se o computador for um notebook, executa o toString() do notebook.
        //Ou seja, this.micros é polimórfico
    }
}
