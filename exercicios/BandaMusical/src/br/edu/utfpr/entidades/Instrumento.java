package br.edu.utfpr.entidades;

import br.edu.utfpr.enums.TipoInstrumento;

public class Instrumento {
    private String nome;
    private TipoInstrumento tipo;
 
    public Instrumento(String nome, TipoInstrumento tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
 
    public String getNome() { 
        return nome; 
    }
    
    public void setNome(String nome) { 
        this.nome = nome; 
    }
 
    public TipoInstrumento getTipo() { 
        return tipo; 
    }
    
    public void setTipo(TipoInstrumento tipo) { 
        this.tipo = tipo; 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instrumento: \n");
        sb.append("Nome: ").append(nome);
        sb.append("\nTipo: ").append(tipo);
        sb.append("\n");
        return sb.toString();
    }
 
    
    
}
