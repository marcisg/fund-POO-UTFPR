
package br.edu.utfpr.main;

import br.edu.utfpr.imc.Imc;
import java.util.Scanner;

public class CalculadoraImc {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira seu peso: ");
        float peso = scan.nextFloat();
        System.out.println("Insira sua altura: ");
        float altura = scan.nextFloat();
        
        Imc imc = new Imc(peso,altura);
        
        System.out.println(imc);     
        
    }
}
