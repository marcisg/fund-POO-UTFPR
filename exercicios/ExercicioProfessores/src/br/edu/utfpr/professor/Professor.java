package br.edu.utfpr.professor;

public abstract class Professor {
    private String nome;
    private String email;
    
    public Professor(){
    
    }
    
    public Professor(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public abstract double calcularSalarioTotal();
    
    public String toString(){
        return "Nome: "  + getNome() + "\nEmail: " + getEmail();
    }
    
    
}
