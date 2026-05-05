package br.edu.utfpr.computador;

public class Processador {
    private String modelo;
    private double velocidade;

    public Processador(String modelo, double velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nModelo:").append(modelo).append("\nVelocidade: ").append(velocidade);
        return sb.toString();
    }
    
    
    
}
