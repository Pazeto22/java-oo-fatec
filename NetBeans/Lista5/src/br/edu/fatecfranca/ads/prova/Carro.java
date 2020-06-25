package br.edu.fatecfranca.ads.prova;

public class Carro extends Veiculo {
    private float capPortaMalas;
    
    public Carro (){
        super();
    }
    
    public Carro(float capPortaMalas, String modelo, int ano){
        super(modelo, ano);
        this.capPortaMalas = capPortaMalas;
    }

    public float getCapPortaMalas() {
        return capPortaMalas;
    }

    public void setCapPortaMalas(float capPortaMalas) {
        if ((capPortaMalas == 220) || (capPortaMalas == 330) || (capPortaMalas == 440)){
           this.capPortaMalas = capPortaMalas; 
        } else System.out.println("Valor Inválido");
    }
    
    @Override
    public String toString(){
        return "\nCarro { " + "Capacidade do Porta Malas: " + capPortaMalas + " }" + super.toString();
    }
}
