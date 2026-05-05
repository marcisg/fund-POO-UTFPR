package br.edu.utfpr.transporte;

public class Aviao extends Transporte {
    private double taxaFixa;
    
    public Aviao(){
        
    }

    public Aviao(double distancia, double capacidadeMaxima, double taxaFixa) {
        super(distancia, capacidadeMaxima);
        this.taxaFixa = taxaFixa;
    }

    public double getTaxaFixa() {
        return taxaFixa;
    }

    public void setTaxaFixa(double taxaFixa) {
        this.taxaFixa = taxaFixa;
    }
   
    @Override
    public double calcularCusto() {
        return (super.getDistancia() * 2.5) + (super.getPesoCarga() * 0.2) + taxaFixa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTaxa Fixa: " + taxaFixa;
    }
    
    
    
}
