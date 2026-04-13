package br.edu.utfpr.usandoProduto;

import br.edu.utfpr.produto.Eletronico;
import br.edu.utfpr.produto.Livro;

public class UsandoProduto {
    public static void main(String[] args) {
        
        Livro livro = new Livro("Dom Casmurro", 29.90, "Machado de Assis");
        double desconto = livro.calcularDesconto();
        
        System.out.println(livro);
        
        System.out.println(String.format("Valor do desconto: %.2f" , desconto));
        System.out.println(String.format("VAlor total: %.2f" , livro.calcularValorTotal(7)));
        
        
        
        Eletronico eletronico = new Eletronico("Smartphone", 1999.99, "Samsung");
        
        double descontoE = eletronico.calcularDesconto();
        
        System.out.println(eletronico);
        
        System.out.println(String.format("Valor do desconto: %.2f" , descontoE));
        System.out.println(String.format("VAlor total: %.2f" , eletronico.calcularValorTotal(5)));
    }
    
}
