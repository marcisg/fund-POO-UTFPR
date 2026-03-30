
package br.edu.utfpr.main;

import br.edu.utfpr.conta.Conta;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        
        do{
            System.out.println("Informe o número da conta: ");
            numero = scan.nextInt();
            if(numero <= 0){
                System.out.println("O número da conta não pode ser 0 e nem negativo!");
            }
        }while(numero <= 0);
        
        
        Conta conta =  new Conta(numero);
        
        System.out.println(conta);
        System.out.println("Digite o valor do depósito: ");
        double deposito = scan.nextDouble();
        conta.depositar(deposito);
        System.out.println("Saldo após o depósito: " + conta.getSaldo());
        System.out.println("Digite o valor do saque: ");
        double saque = scan.nextDouble();
        if(conta.sacar(saque)){
            System.out.println("Saldo após o saque: " + conta.getSaldo());
        } else{
            System.out.println("Erro no saque. Verifique o valor e o saldo disponível.");
        } 
    }
}
