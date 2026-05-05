package br.edu.utfpr.entidades;

import br.edu.utfpr.enums.Situacao;



public class Matricula {
    private Curso curso;
    private Aluno aluno;
    private Disciplina disciplina;
    private int anoIngresso;
    private int serie;
    private Historico historico;
    
    public Matricula(Curso curso, Aluno aluno, Disciplina disciplina, int anoIngresso, int serie, String observacao){
        this.curso = curso;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.anoIngresso = anoIngresso;
        this.serie = serie;
        this.historico = new Historico(observacao, aluno, Situacao.REGULAR);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Historico getHistorico() {
        return historico;
    }

    @Override
    public String toString() {
        return "Curso: " + curso + "\nAluno: " + aluno + "\nDisciplina: " + disciplina 
                + "\nAno Ingresso: " + anoIngresso + "\nSérie: " + serie + historico;
    }
    
    
   
}
