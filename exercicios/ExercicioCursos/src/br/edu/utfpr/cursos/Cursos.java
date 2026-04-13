package br.edu.utfpr.cursos;

public abstract class Cursos {
    private String titulo;
    private String instrutor;
    private int duracaoHoras;
    
    public Cursos(){
    
    }
    
    public Cursos(String titulo, String instrutor, int duracaoHoras){
        this.titulo = titulo;
        this.instrutor = instrutor;
        this.duracaoHoras = duracaoHoras;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setInstrutor(String instrutor){
        this.instrutor = instrutor;
    }
    
    public String getInstrutor(){
        return instrutor;
    }
    
    public void setDuracaoHoras(int duracaoHoras){
        this.duracaoHoras = duracaoHoras;
    }
    
    public int getDuracaoHoras(){
        return duracaoHoras;
    }
    
    public abstract double calcularCustoTotal();
    
    public String toString(){
        return "Título: " + getTitulo() + "\nInstrutor: " + getInstrutor() + "\nDuração: " + getDuracaoHoras();
    }
}
