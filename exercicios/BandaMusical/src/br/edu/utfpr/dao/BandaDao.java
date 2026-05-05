package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Banda;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BandaDao {
    private List<Banda> bandas;
 
    public BandaDao() {
        this.bandas = new ArrayList<>();
    }
 
    public void adicionarBanda(Banda banda) {
        bandas.add(banda);
    }
    
    public List<Banda> getBandas() {
        return bandas;
    }
 
    public boolean removerBanda(int id) {
        return bandas.removeIf(b -> b.getId() == id);
    }
    
    public List<Banda> pesquisarPorNome(String nomeBanda) {
        List<Banda> novaLista = new ArrayList<>();
        for (Banda b : bandas) {
            if (b.getNome().equalsIgnoreCase(nomeBanda)) {
                novaLista.add(b);
            }
        }
        return novaLista;
    }
 
    public void ordenarPorNome() {
        bandas.sort(Comparator.comparing(Banda::getNome));
    }
 
    public void imprimirBanda() {
        if (bandas.isEmpty()) {
            System.out.println("Nenhuma banda cadastrada.");
            return;
        }
        System.out.println("Lista de bandas: ");
        for (Banda b : bandas) {
            StringBuilder sb = new StringBuilder();
            sb.append("ID: ").append(b.getId()).append("\n");
            sb.append("Nome: ").append(b.getNome()).append("\n");
            sb.append("Líder: ").append(b.getLider().getNome()).append("\n");
            sb.append(b.imprimirMusicos()).append("\n");
            System.out.println(sb.toString());
        }
    }
 
}
