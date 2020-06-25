package br.edu.fatecfranca.ads;

import java.util.ArrayList;

public class Post {
    private String titulo;
    private String conteudo;
    private ArrayList<Usuario> usuarios;
    
    public Post(){
        usuarios = new ArrayList();
    }
    
    public Post(String titulo, String conteudo, ArrayList<Usuario> usuarios){
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.usuarios = new ArrayList();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public void addUsuario(Usuario user){
        this.getUsuarios().add(user);
    }

    public boolean removeUsuario(Usuario user){
        return this.usuarios.remove(user);
    }

    public int getUsuario(Usuario user) {
        return this.usuarios.indexOf(user);
    }

    public boolean updateUsuarios(Usuario user, Usuario novo) {
        int posicao = this.getUsuario(user);
        if (posicao != -1) {
            this.usuarios.set(posicao, novo);
            return true;
        } else {
            return false;
        }
    }  
    
    @Override
    public String toString(){
        super.toString();
        return "\nPost {" + "Título: " + titulo + ", Conteúdo: " + conteudo + "\nAutores: " + usuarios + "}";
    }
}
