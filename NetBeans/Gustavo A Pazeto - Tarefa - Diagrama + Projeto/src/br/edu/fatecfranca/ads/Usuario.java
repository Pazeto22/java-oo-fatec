package br.edu.fatecfranca.ads;

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected int posts;
    protected int reviews;
    protected int content;
    
    public Usuario(){}
    
    public Usuario(String nome, String email, int posts, int reviews){
        this.nome = nome;
        this.email = email;
        this.posts = posts;
        this.reviews = reviews;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
    
    @Override
    public String toString(){
        return "\nUsuário{ " + "Nome: " + getNome() + ", Email: " 
                + getEmail() + ", Posts: " + getPosts() + ", Análises: " + getReviews()
                + ", Participações em conteúdo: " + getContent() + " }";
    }
    
    public void totalContent(){
        this.setContent(this.getPosts() + this.getReviews());
    }    
}
