package br.edu.utfpr.main;

import br.edu.utfpr.boletim.BoletimEscolar;
import br.edu.utfpr.boletim.BoletimComRecuperacao;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       BoletimEscolar aluno = new BoletimEscolar();

       System.out.println("Digite o nome do aluno: ");
       aluno.setNome(scan.nextLine());

       for (int i = 0; i < 4; i++) {
           System.out.println("Digite a nota "+ (i+1) +": ");
           aluno.setNota(i, scan.nextDouble());
       }

       System.out.println(aluno.toString());
       System.out.println("\nMédia final: " + aluno.calcularMedia());
       if (aluno.calcularMedia() >= 7){
           System.out.println("\nAprovado sem recuperação.");
       } else {
           BoletimComRecuperacao recuperacao = new BoletimComRecuperacao();
           recuperacao.setNome(aluno.getNome());

           for (int i = 0; i < 4; i++) {
               recuperacao.setNota(i, aluno.getNota(i));
           }

           System.out.println("\nAluno em recuperação.");
           System.out.println("\nDigite a nota da recuperação: ");
           recuperacao.setNotaRecuperacao(scan.nextDouble());
           System.out.println("Boletim após recuperação: ");
           System.out.println(recuperacao.toString());
           System.out.println("Situação: " + recuperacao.verificarAprovacao());
       }
   }
}