/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Dell
 */
public class ItemPedido {
    private static int contadorId=0;
    private int id;
    private Produto produto;
    private int quantidade;

    public ItemPedido() {
        this.id = ++contadorId;
    }

    public ItemPedido(Produto produto, int quantidade) {
        this.id = ++contadorId;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Produto:" + produto + ", quantidade=" + quantidade;
    }
    
    
}
