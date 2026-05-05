package br.edu.utfpr.entidades;

import br.edu.utfpr.enums.Dificuldade;


public class Doce extends Receita {
    private boolean possuiAcucar;
 
    public Doce(String nome, int tempoPreparo, Dificuldade dificuldade, boolean possuiAcucar) {
        super(nome, tempoPreparo, dificuldade);
        this.possuiAcucar = possuiAcucar;
    }
 
    public boolean isPossuiAcucar() { 
        return possuiAcucar; 
    }
    
    public void setPossuiAcucar(boolean possuiAcucar) { 
        this.possuiAcucar = possuiAcucar; 
    }

    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Doce ");
        sb.append("| Possui Açúcar: ").append(possuiAcucar);
        sb.append("\n");
        return sb.toString();
    }*/
}
