package br.edu.utfpr.professor;

public class ProfessorEfetivo extends Professor {
    private double adicionalTitulacao;
    private double salarioBase;
    
    public ProfessorEfetivo(){
    
    }
    
    public ProfessorEfetivo(String nome, String email, double adicionalTitulacao, double salarioBase){
        super(nome, email);
        this.adicionalTitulacao = adicionalTitulacao;
        this.salarioBase = salarioBase;
    }
    
    public void setTitulacao(double adicionalTitulacao){
        this.adicionalTitulacao = adicionalTitulacao;
    }
    
    public double getTitulacao(){
        return adicionalTitulacao;
    }
    
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }

    @Override
    public double calcularSalarioTotal() {
        return getTitulacao() + getSalarioBase();
    }
    
    @Override
    public String toString(){
        return super.toString()+ "\nAdicional Titulação: " + getTitulacao() + "\nSalário Base: " + getSalarioBase();
    }
}
