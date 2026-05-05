/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Andreia
 */
public class Disciplina {
    private String descricao;
    private Professor professor;

    public Disciplina(String descricao, Professor professor) {
    
        this.descricao = descricao;
        this.professor = professor;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

 
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return  descricao + "\nProfessor:" + professor.getNome() ;
    }
    
}
