package br.edu.utfpr.transporte;

public abstract class Transporte {
    private double distancia;
    private double pesoCarga;
    private double capacidadeMaxima;
    
    public Transporte(){
    
    }

    public Transporte(double distancia, double capacidadeMaxima) {
        this.pesoCarga = 0;
        this.distancia = distancia;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
    
    public boolean adicionarCarga(double peso){
        if(peso + pesoCarga < capacidadeMaxima){
            pesoCarga += peso;
            return true;
        } 
        return false;  
    }
    
    public boolean removerCarga(double peso){
        if(pesoCarga - peso >= 0){
            pesoCarga -= peso;
            return true;
        }
        return false;
    }
    
    public abstract double calcularCusto();
        
    @Override
    public String toString() {
        return "Distancia: " + distancia + "\nPesoCarga: " + pesoCarga + "/nCapacidadeMaxima=" + capacidadeMaxima;
    }
    
    
    
}
