package br.edu.utfpr.mode;

public class Servidor extends Pessoa{
    private int siape;
    
    public Servidor(){
    
    }
    
    public Servidor(String nome, int idade, int siape){
        super(nome, idade);
        this.siape = siape;
    }
    
    public void setSiape(int siape){
        this.siape = siape;
    }
    
    public int getSiape(){
        return siape;
    }
    
    public String toString(){
        return "\n\nDados do Servidor "+ super.toString() + "\nSIAPE: " + siape;
    }
}