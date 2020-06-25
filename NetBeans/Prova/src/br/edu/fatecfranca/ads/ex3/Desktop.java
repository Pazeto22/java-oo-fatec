package br.edu.fatecfranca.ads.ex3;

public class Desktop extends Computador {
    private float tamGab;
    
    public Desktop(){
        super();
    }
    
    public Desktop(float tamGab, String descricao){
        super(descricao);
        this.tamGab = tamGab;
    }

    public float getTamGab() {
        return tamGab;
    }

    public void setTamGab(float tamGab) {
        this.tamGab = tamGab;
    }
    
    @Override
    public String toString(){
        return "\nDesktop { " + "Tamanho do Gabinete: " + tamGab + " }"
                + super.toString();
    }
    
}
