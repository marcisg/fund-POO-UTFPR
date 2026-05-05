package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Excursao;
import br.edu.utfpr.entidades.Passageiro;
import java.util.ArrayList;
import java.util.List;

public class ExcursaoDao {
    private List<Excursao> listaExcursoes;
    private List<Passageiro> passageirosGerais = new ArrayList<>();

    public ExcursaoDao() {
        this.listaExcursoes = new ArrayList<>();
    }
    
    public void inserirExcursao(Excursao excursao) {
        listaExcursoes.add(excursao);
    }
    
    public String listaGeralPassageiros(){
        StringBuilder sb = new StringBuilder();
        sb.append("---------- Lista de todos os passageiros ----------\n");

        for(Passageiro p: passageirosGerais){
            sb.append(p);
        }
        return sb.toString();
    }
    
    public void addPassageiro(Passageiro passageiro, Excursao excursao){
        passageirosGerais.add(passageiro); 

        if (excursao != null) {
            excursao.addPassageiro(passageiro); 
        }     
    }
    
    public boolean excluirPassageiroExcursao(Excursao excursao, String documento){
        if (excursao != null) {
            return excursao.getPassageiro().removeIf(p -> documento.equals(p.getDocumento()));
        }     
        return false;     
    }
    
    public String imprimeExcursoes(){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(Excursao ex: listaExcursoes){
            sb.append("---------- Excursão ").append(count).append(" ----------\n");
            sb.append(ex);
            count++;
        }
        return sb.toString();
    }
}
