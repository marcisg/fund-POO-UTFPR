package br.edu.utfpr.entidades;

import br.edu.utfpr.enums.Dificuldade;
import java.util.ArrayList;
import java.util.List;

public class Receita {
    private int id;
    private String nome;
    private int tempoPreparo;
    private Dificuldade dificuldade;
    private List<Ingrediente> ingredientes;
    private static int contador = 0;
 
    public Receita(String nome, int tempoPreparo, Dificuldade dificuldade) {
        this.id = ++contador;
        this.nome = nome;
        this.tempoPreparo = tempoPreparo;
        this.dificuldade = dificuldade;
        this.ingredientes = new ArrayList<>();
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
 
    public int getTempoPreparo() { 
        return tempoPreparo; 
    }
    
    public void setTempoPreparo(int tempoPreparo) { 
        this.tempoPreparo = tempoPreparo; 
    }
 
    public Dificuldade getDificuldade() { 
        return dificuldade; 
    }
    
    public void setDificuldade(Dificuldade dificuldade) { 
        this.dificuldade = dificuldade; 
    }
 
    public List<Ingrediente> getIngredientes() { 
        return ingredientes; 
    }
 
    public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }
 
    public void listarIngredientes() {
        System.out.println(nome + ":");
        System.out.println("Ingredientes:");
        for (Ingrediente i : ingredientes) {
            System.out.println("- " + i.getNome() + ": " + i.getQuantidade());
        }
    }
 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Receita: ").append(nome);
        sb.append(" | Tempo de Preparo: ").append(tempoPreparo).append(" min");
        sb.append(" | Dificuldade: ").append(dificuldade.getDescricao());
        return sb.toString();
    }
}
