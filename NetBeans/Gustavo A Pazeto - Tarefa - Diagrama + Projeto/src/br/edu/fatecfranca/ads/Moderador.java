package br.edu.fatecfranca.ads;

public class Moderador extends Usuario {
    private int postsModerados;
    
    public Moderador(){
        super();
    }
    
    public Moderador (int postsModerados, 
            String nome, String email, int posts, int reviews){
        super(nome, email, posts, reviews);
        this.postsModerados = postsModerados;
    }
    
    @Override
    public void totalContent(){
        super.totalContent();
        this.content = this.content + this.postsModerados;
    }    

    public int getPostsModerados() {
        return postsModerados;
    }

    public void setPostsModerados(int postsModerados) {
        this.postsModerados = postsModerados;
    }
    
    @Override
    public String toString(){
        super.toString();
        return "\nModerador { " + "Posts Moderados: " + getPostsModerados()
                + super.toString() +  " }";
    }    
}
