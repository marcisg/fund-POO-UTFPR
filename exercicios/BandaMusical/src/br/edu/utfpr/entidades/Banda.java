package br.edu.utfpr.entidades;

import java.util.ArrayList;
import java.util.List;

public class Banda {
    private int id;
    private String nome;
    private Musico lider;
    private List<Musico> musicos;
    private static int contador = 0;
    
    public Banda(String nome, Musico lider) {
        this.id = ++contador;
        this.nome = nome;
        this.lider = lider;
        this.musicos = new ArrayList<>();
        this.musicos.add(lider);
    }
    
    public int getId() { 
        return id; 
    }
 
    public String getNome() { 
        return nome; 
    }
    
    public void setNome(String nome) { 
        this.nome = nome; 
    }
 
    public Musico getLider() { 
        return lider; 
    }
    
    public void setLider(Musico lider) { 
        this.lider = lider; 
    }
 
    public List<Musico> getMusicos() { 
        return musicos; 
    }
 
    public void addMusico(Musico musico) {
        this.musicos.add(musico);
    }
    
    public String imprimirMusicos() {
        StringBuilder sb = new StringBuilder("Músicos:\n");
        for (Musico m : musicos) {
            sb.append("- ").append(m.getNome())
              .append(" tocando ").append(m.getInstrumento().getNome()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Banda: ").append(id).append("\n");
        sb.append(nome).append("\n");
        sb.append("Lider: ").append(lider.getNome()).append("\n");
        sb.append("Lista de músicos: \n").append(imprimirMusicos());
        return sb.toString();
    }

    
    
}
