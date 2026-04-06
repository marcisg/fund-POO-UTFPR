package br.edu.utfpr.funcionarios;

public class Telefonista extends Funcionario {
    private int ramal;
    
    public Telefonista(){
        
    }
    
    public Telefonista(String nome, double salario, int ramal){
        super(nome, salario);
        this.ramal = ramal;
    }
    
    public void setRamal(int ramal){
        this.ramal = ramal;
    }
    
    public int getRamal(){
        return ramal;
    }
    
    public double calcularBonificacao(){
        return super.getSalario() * 0.05;
    }
    
    public double calcularSalarioTotal(){
        return super.getSalario() + calcularBonificacao();
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\nRamal").append(ramal);
        return sb.toString();
    }
}
