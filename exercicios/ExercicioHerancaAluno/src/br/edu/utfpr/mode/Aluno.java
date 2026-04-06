package br.edu.utfpr.mode;

public class Aluno extends Pessoa {
    private int ra;
    
    public Aluno(){
    
    }
    
    public Aluno(String nome, int idade, int ra){
        super(nome, idade);
        this.ra = ra;
    }
    
    public void setRa(int ra){
        this.ra = ra;
    }
    
    public int getRa(){
        return ra;
    }
    
    public String toString(){
        return "\nDados do Aluno" + super.toString() + "\nRA: " + ra;
    }
}