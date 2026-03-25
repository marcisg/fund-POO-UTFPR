package br.edu.utfpr.main;

import br.edu.utfpr.quadrilatero.Quadrilatero;

import java.util.Scanner;

public class InterfaceQuadrilatero {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char repetir = 'n';

        int lado1 = 0;
        int lado2 = 0;


        do{
            System.out.println("Informe o valor do lado 1: ");
            lado1 = scan.nextInt();
            System.out.println("Informe o valor do lado 2: ");
            lado2 = scan.nextInt();
            if(lado1 <= 0 || lado2 <= 0){
                repetir = 's';
                System.out.println("Nenhum lado pode ser 0 ou negativo!");
            } else {
                repetir = 'n';
            }
        }while (repetir == 's');

        Quadrilatero quadrilatero = new Quadrilatero(lado1, lado2);

        System.out.println("===========Dados do Quadrilátero=========\n");
        System.out.println(quadrilatero);
        System.out.println("\n==============================\n");
        if(quadrilatero.isRetangulo()){
            System.out.println("É retângulo.");
        }
        if (quadrilatero.isQuadrado()){
            System.out.println("É quadrado.");
        }
        System.out.println("\n==============================\n");
        System.out.println("Área: " + quadrilatero.getAreaPlana());
        System.out.println("\n==============================\n");
        System.out.println("Perímetro: " + quadrilatero.getPerimetro());

    }
}
