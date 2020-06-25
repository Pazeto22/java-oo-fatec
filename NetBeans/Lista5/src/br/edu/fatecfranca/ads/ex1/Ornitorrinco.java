package br.edu.fatecfranca.ads.ex1;

// classe interface permite herança multipla não real, não herdamos código, apenas comportamento
public class Ornitorrinco implements Ave, Mamifero {

    @Override
    public String por0ovos() {
        return "Ornitorrinco pondo ovos";
    }

    @Override
    public String darMama() {
        return "Ornitorrinco dando de mamar";
    }
    
}
