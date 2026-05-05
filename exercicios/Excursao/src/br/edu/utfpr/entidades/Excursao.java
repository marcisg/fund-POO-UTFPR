package br.edu.utfpr.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursao {
    private String destino;
    private LocalDate data;
    private Guia guiaResponsavel;
    private Veiculo veiculo;
    private List<Passageiro> passageiros;
    
    public Excursao() {
        this.passageiros = new ArrayList<>();
    }

    public Excursao(String dstino, LocalDate data, Guia guiaResponsavel, Veiculo veiculo) {
        this.destino = dstino;
        this.data = data;
        this.guiaResponsavel = guiaResponsavel;
        this.veiculo = veiculo;
        this.passageiros = new ArrayList<>();
    }

    public String getDstino() {
        return destino;
    }

    public void setDstino(String dstino) {
        this.destino = dstino;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Guia getGuiaResponsavel() {
        return guiaResponsavel;
    }

    public void setGuiaResponsavel(Guia guiaResponsavel) {
        this.guiaResponsavel = guiaResponsavel;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Passageiro> getPassageiro() {
        return passageiros;
    }

    public void addPassageiro(Passageiro passageiro){
        this.passageiros.add(passageiro);
    }
    
    public String imprimePassageiro(){
        StringBuilder sb = new StringBuilder();
        for (Passageiro p: passageiros){
            sb.append(p.toString());
        }
        return sb.toString();
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Destino: ").append(destino);
        sb.append("\nData: ").append(data).append(guiaResponsavel);
        sb.append("Veículo: ").append(veiculo);
        sb.append("\n\nLista de Passageiros: ").append(passageiros);
        sb.append("\n\n");
        return sb.toString();
    }
    
    
    
}
