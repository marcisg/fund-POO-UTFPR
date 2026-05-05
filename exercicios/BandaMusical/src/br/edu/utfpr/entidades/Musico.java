package br.edu.utfpr.entidades;

public class Musico {
    private String nome;
    private Instrumento instrumento;
 
    public Musico(String nome, Instrumento instrumento) {
        this.nome = nome;
        this.instrumento = instrumento;
    }
 
    public String getNome() { 
        return nome; 
    }
    
    public void setNome(String nome) { 
        this.nome = nome; 
    }
 
    public Instrumento getInstrumento() { 
        return instrumento; 
    }
    
    public void setInstrumento(Instrumento instrumento) { 
        this.instrumento = instrumento; 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome);
        sb.append("\nInstrumento: ").append(instrumento);
        sb.append("\n");
        return sb.toString();
    }   
}
