
package br.utfpr.edu.aula2;

import java.util.Scanner;

public class Aula2 {
        
    public static void main(String[] args){
        int res;
        //objeto que permite entrada de dados via teclado
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor do número 1:");
        int num1 = input.nextInt();
        System.out.println("Informe o valor do número 2:");
        int num2 = input.nextInt();
        
        System.out.println("Número 1: "+ num1 + "\nNúmero 2: " + num2);
        
        res = num1 + num2;
        
        System.out.println("Soma: " + res);
        
        if(num1 > 0){
            for(int i = 0; i <= 10;i++){
                System.out.println(""+num1+" x "+""+i+" = "+ (num1 * i));
            }
            if(num1%2==0){
                System.out.println("O número "+num1+" é par.");
            }else{
                System.out.println("O número "+num1+" é ímpar.");
            }
        } else{
            System.out.println("O número não pode ser zero ou negativo!");
        }
        
    }
    
}
