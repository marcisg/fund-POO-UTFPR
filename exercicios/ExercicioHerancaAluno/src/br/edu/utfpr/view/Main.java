package br.edu.utfpr.view;

import br.edu.utfpr.mode.Aluno;
import br.edu.utfpr.mode.Servidor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Servidor servidor = new Servidor();
        
        System.out.println("Nome Aluno: ");
        aluno.setNome(scan.nextLine());
        System.out.println("Idade Aluno: ");
        aluno.setIdade(scan.nextInt());
        System.out.println("RA: ");
        aluno.setRa(scan.nextInt());
        scan.nextLine();
        
        System.out.println("Nome Servidor: ");
        servidor.setNome(scan.nextLine());
        System.out.println("Idade Servidor: ");
        servidor.setIdade(scan.nextInt());
        System.out.println("SIAPE: ");
        servidor.setSiape(scan.nextInt());  
        
        System.out.println(aluno);
        System.out.println(servidor);
        
    }
}
