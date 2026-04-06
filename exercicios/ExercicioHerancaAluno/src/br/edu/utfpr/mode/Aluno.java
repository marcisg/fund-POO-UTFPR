
package br.edu.utfpr.mode;


public class Aluno extends Pessoa {
    private int ra;
    
    public Aluno(){
    
    }
    
    public Aluno(String nome, int idade, int ra){
        super(nome, idade);
        this.ra = ra;
        
    }
}
