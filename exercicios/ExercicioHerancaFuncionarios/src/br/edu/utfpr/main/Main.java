package br.edu.utfpr.main;

import br.edu.utfpr.funcionarios.Gerente;
import br.edu.utfpr.funcionarios.Telefonista;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Paulo", 6000.00 , "admin", "senha123");
        Telefonista telefonista = new Telefonista("Ana", 3000.00, 3524);
        
        System.out.println("\n====Gerente====");
        System.out.println(gerente.toString());
        System.out.println(gerente.toString() + "\nValor da bonificação: " + gerente.calcularBonificacao());
        System.out.println("Salário Total: " + gerente.calcularSalarioTotal());
        System.out.println("\n====Telefonista====");
        System.out.println(telefonista.toString());
        System.out.println(telefonista.toString() + "\nValor da bonificação: " + telefonista.calcularBonificacao());
        System.out.println("Salário Total: " + telefonista.calcularSalarioTotal());
    }
}
