package br.edu.fatecfranca.ads;

public class Teste {
    
    public static void totalContent(Usuario camaleao){
        camaleao.totalContent();
        System.out.println(camaleao.toString());
    }

    public static void main(String[] args) {
        
        Administrador adm1 = new Administrador(22, "Ricardo", "ricardinho@gmail.com", 73, 12);
        totalContent(adm1);
        
        Moderador mod1 = new Moderador(8, "Maria", "mariazinha@bol.com", 49, 53);
        totalContent(mod1);

        Post P1 = new Post();
        P1.setTitulo("A casa caiu");
        P1.setConteudo("Descobriu-se que, de fato, a vaca foi para o brejo.");
        P1.addUsuario(adm1);
        P1.addUsuario(mod1);
        
        System.out.println(P1.toString());
        
    }
    
}
