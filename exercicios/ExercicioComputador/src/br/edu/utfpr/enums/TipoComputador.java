package br.edu.utfpr.enums;

//dificuldade geral em entender o ciclo de quando entra no enum, ele é chamado dentro do objeto computador?
public enum TipoComputador {
    DESKTOP("Desktop"),
    NOTEBOOK("Notebook"),
    SERVIDOR("Servidor");
    
    //dificuldade pra entender o que tinha de ser feito no enum depois daqui

    private String descricao;

    private TipoComputador(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
