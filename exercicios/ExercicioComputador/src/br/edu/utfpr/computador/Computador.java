package br.edu.utfpr.computador;

import br.edu.utfpr.enums.TipoComputador;

public class Computador extends Equipamento {
    private Processador processador;
    private Cliente cliente;
    private TipoComputador tipo;
    
    //dificuldade em fazer o construtor
    public Computador(String marca, double valorBase, String modelo, double velocidade, Cliente cliente, TipoComputador tipo) {
        super(marca, valorBase);
        this.processador = new Processador(modelo, velocidade);
        this.cliente = cliente;
        this.tipo = tipo;
    }
    
     public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoComputador getTipo() {
        return tipo;
    }

    public void setTipo(TipoComputador tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public double calcularValorManutencao() {
        double valorBase = getValorBase();
        double resultado;

         switch (tipo) {
            case NOTEBOOK:
                resultado = valorBase * 0.15;
                break;
            case DESKTOP:
                resultado = valorBase * 0.10;
                break;
            case SERVIDOR:
                resultado = valorBase * 0.20;
                break;
            default:
                resultado = 0;
        }
        
        return resultado;
}
    
     @Override
    public String toString() {
        return "Marca: " + getMarca() + "\nTipo: " + tipo.getDescricao() +"\nProcessador: " + processador + cliente;
    }
    
}
