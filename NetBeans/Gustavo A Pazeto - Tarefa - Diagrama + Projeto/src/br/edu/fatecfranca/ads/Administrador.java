package br.edu.fatecfranca.ads;

public class Administrador extends Usuario {
    private int postsPublicitarios;
    
    public Administrador(){
        super();
    }
    
    public Administrador(int postsPublicitarios, 
            String nome, String email, int posts, int reviews){
        super(nome, email, posts, reviews);
        this.postsPublicitarios = postsPublicitarios;
    }
    
    @Override
    public void totalContent(){
        super.totalContent();
        this.content = this.content + this.postsPublicitarios;
    }       

    public int getPostsPublicitarios() {
        return postsPublicitarios;
    }

    public void setPostsPublicitarios(int postsPublicitarios) {
        this.postsPublicitarios = postsPublicitarios;
    }
    
    @Override
    public String toString(){
        super.toString();
        return "\nAdministrador { " + "Posts Publicitários: " 
                + getPostsPublicitarios() + super.toString() + " }";
    }
}
