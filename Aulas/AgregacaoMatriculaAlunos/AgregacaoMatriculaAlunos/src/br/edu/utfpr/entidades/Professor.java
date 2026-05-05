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
public class Professor extends Pessoa{
    private String siape;

    public Professor() {
    }

    public Professor(String nome, String email, String siape) {
        super(nome, email);
        this.siape = siape;
    }


    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSIAPE:" + siape;
    }
    
    
}
