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
public class Aluno extends Pessoa {

    private String ra;

    public Aluno() {
    }

    public Aluno(String nome, String email, String ra) {
        super(nome, email);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRA: " + ra;
    }

}
