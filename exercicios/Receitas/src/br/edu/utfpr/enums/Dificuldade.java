package br.edu.utfpr.enums;

public enum Dificuldade {
    FACIL("Fácil"),
    MEDIA("Média"),
    DIFICIL("Difícil");
 
    private final String descricao;
 
    Dificuldade(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
}
