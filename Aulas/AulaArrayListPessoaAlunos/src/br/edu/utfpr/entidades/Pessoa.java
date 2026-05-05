/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.entidades;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Pessoa {

    private static int contador=0;
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private int idade;

    public Pessoa() {
        this.id=++contador;
    }

    public Pessoa(String nome, String email, String telefone, int idade) {
        this.id=++contador;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }

    public int getCodigo() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    @Override
    public String toString() {
        return "{ Codigo: " + getCodigo()
                + " Nome: " + getNome()
                + " Email: " + getEmail()
                + " Telefone: " + getTelefone() 
                + " Idade: " + getIdade()+ " }";
    }

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        return hash;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Pessoa other = (Pessoa) obj;
//        return Objects.equals(this.nome, other.nome);
//    }


//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Pessoa other = (Pessoa) obj;
//        if (this.idade != other.idade) {
//            return false;
//        }
//        if (!Objects.equals(this.nome, other.nome)) {
//            return false;
//        }
//        return Objects.equals(this.email, other.email);
//    }
        @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pessoa pessoa = (Pessoa) obj;
        return idade == pessoa.idade;
    }
    
      @Override
    public int hashCode() {
        return Objects.hash(idade);
    }

    
}
