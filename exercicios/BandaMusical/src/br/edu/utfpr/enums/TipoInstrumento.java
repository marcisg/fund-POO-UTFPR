package br.edu.utfpr.enums;

public enum TipoInstrumento {
    CORDA("Instrumento de corda, como violão, violino, guitarra."),
    SOPRO("Instrumento de sopro, como flauta, trompete, saxofone."),
    PERCUSSAO("Instrumento de percussão, como bateria, tambor, pandeiro.");
 
    private final String descricao;
 
    TipoInstrumento(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
    
}
