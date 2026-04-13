/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.produto;

/**
 *
 * @author Andreia
 */
public abstract class Produto {
    private String nome;
    private double preco;
    
   
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
   
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public abstract double calcularDesconto();
    
    public double calcularValorTotal(int quantidade){
        return (preco - calcularDesconto()) * quantidade;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + "\nPreço: " + preco ;
    }
    
    
}
