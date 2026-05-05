package br.edu.utfpr.transporte;

public class Caminhao extends Transporte {
    private double custoPorKm;
    
    public Caminhao(){
        
    }

    public Caminhao(double distancia, double capacidadeMaxima, double custoPorKm){
        super(distancia, capacidadeMaxima);
        this.custoPorKm = custoPorKm;
    }

    public double getCustoPorKm() {
        return custoPorKm;
    }

    public void setCustoPorKm(double custoPorKm) {
        this.custoPorKm = custoPorKm;
    }

    @Override
    public double calcularCusto() {
      return super.getDistancia() * custoPorKm + (super.getPesoCarga() * 0.05);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCusto por Km: " + custoPorKm;
    }
    
    
}
