package br.edu.utfpr.computador;

public abstract class Equipamento {
    private String marca;
    private double valorBase;

    public Equipamento(String marca, double valorBase) {
        this.marca = marca;
        this.valorBase = valorBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
    
    public abstract double calcularValorManutencao();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMarca: ").append(marca).append("\nValor base: ").append(valorBase);
        return sb.toString();
    }
    
    
    
}
