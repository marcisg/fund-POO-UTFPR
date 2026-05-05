package br.edu.utfpr.entidades;

import br.edu.utfpr.enums.Situacao;
import java.time.LocalDate;

public class Historico {
    private LocalDate dataCriacao;
    private String observacao;
    private Aluno aluno;
    private Situacao situacao;

    public Historico(String observacao, Aluno aluno, Situacao situacao) {
        this.dataCriacao = LocalDate.now();
        this.observacao = observacao;
        this.aluno = aluno;
        this.situacao = situacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    @Override
    public String toString() {
        return "\nHistórico do Aluno: "+ aluno.getNome()+ 
                "\nData: " + dataCriacao + 
                "\nObservação: " + observacao + 
                "\nSituação: " + situacao ;
    }
    
    
}
