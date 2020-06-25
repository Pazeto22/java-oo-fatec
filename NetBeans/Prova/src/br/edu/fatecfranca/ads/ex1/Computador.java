package br.edu.fatecfranca.ads.ex1;

public class Computador {
    private String modo;
    private int memoria;
    
    public Computador(){}
    
    public Computador(String modo, int memoria){
        this.setModo(modo);
        this.setMemoria(memoria);
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        if (modo == "em repouso" || modo == "ligado" || modo == "desligado"){
            this.modo = modo;
        } else {
            System.out.println("Modo incompatível");
        }
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        if (memoria == 4 || memoria == 8 || memoria == 16 || memoria == 32){
            if(this.memoria + memoria > 32){
                System.out.println("Quantidade de memória não suportada pelo sistema");
            } else {
                this.memoria = memoria;
            }
        } else {
            System.out.println("Quantidade de memória incompatível com o sistema");
        }
    }
    
    public void upgradeMemoria (int up) {
        setMemoria(this.memoria + up);
    }
    
}
