package br.edu.fatecfranca.ads.ex3;

public class Notebook extends Computador{
    private float capBat;
    
    public Notebook(){
        super();    
    }
    
    public Notebook(float capBat, String descricao){
        super(descricao);
        this.capBat = capBat;
    }

    public float getCapBat() {
        return capBat;
    }

    public void setCapBat(float capBat) {
        this.capBat = capBat;
    }
    
    @Override
    public String toString(){
        return "\nNotebook { " + "Capacidade da Bateria: " + capBat + " }"
                + super.toString();
    }
}
