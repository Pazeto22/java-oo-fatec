package br.edu.fatecfranca.ads.ex3;

public class teste {

    public static void main(String[] args) {
        Desktop pc1 = new Desktop(63, "Baita de um computador");
        Notebook pc2 = new Notebook(666, "Notebook possuído");
        
        LanHouse lh = new LanHouse();
        lh.addComputador(pc1);
        
        System.out.println(lh.toString());
        
        lh.addComputador(pc2);
        System.out.println(lh.toString());
    }
    
}
