
package br.edu.utfpr.operacoes;

import br.edu.utprf.main.Operacoes;

public class UsandoOperacoes {
    
     public static void main(String[] args) {
        System.out.println("--------Operações 1---------");
        Operacoes op1 = new Operacoes();
        op1.setNum1(9);
        op1.setNum2(2);
        System.out.println(op1);
        
        System.out.println("Soma: " + op1.somar());
        System.out.println("Subtração: " + op1.subtrair());
        System.out.println("Multiplicação: " + op1.multiplicar());
        System.out.println("Divisão: " + op1.dividir());
        
        System.out.println("--------Operações 2---------");
        Operacoes op2 = new Operacoes(10, 3);
        System.out.println(op2);
    }  
}