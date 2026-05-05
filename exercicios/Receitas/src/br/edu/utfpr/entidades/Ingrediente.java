package br.edu.utfpr.entidades;

public class Ingrediente {
    private String nome;
    private String quantidade;
 
    public Ingrediente(String nome, String quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
 
    public String getNome() { 
        return nome; 
    }
    
    public void setNome(String nome) { 
        this.nome = nome; 
    }
 
    public String getQuantidade() { 
        return quantidade; 
    }
    
    public void setQuantidade(String quantidade) { 
        this.quantidade = quantidade; 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNome: ").append(nome);
        sb.append("\nQuantidade: ").append(quantidade);
        return sb.toString();
    }
}
