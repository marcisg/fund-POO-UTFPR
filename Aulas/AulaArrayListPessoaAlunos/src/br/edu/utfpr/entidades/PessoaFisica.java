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
public class PessoaFisica extends Pessoa {
    private long cpf;

    public PessoaFisica() {
    }

    
    public PessoaFisica( long cpf, String nome, String email, String telefone, int idade) {
        super( nome, email, telefone, idade);
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString()+  "CPF:" + cpf;
    }
    
    
}
