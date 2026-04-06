package br.edu.utfpr.boletim;

public class Aluno {
   private String nome;
   private double[] notas;

   public Aluno(){
       notas = new double[4];
   }

   public Aluno(String nome, double[] notas){
       this.nome = nome;
       this.notas = notas;
   }

   public void setNota(int i, double valor) {
       this.notas[i] = valor;
   }

   public double getNota(int i) {
       return notas[i];
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public String getNome() {
       return nome;
   }

   public double calcularMedia(){
       double soma = 0;
       for (int i = 0; i < 4; i++) {
           soma+= notas[i];
       }
       return soma/4;
   }

   @Override
   public String toString(){
       StringBuilder sb = new StringBuilder();
       sb.append("\nBoletim de ").append(nome).append(": ").append("\nNota 1: " ).append(notas[0]).append("\nNota 2: ").append(notas[1]).append("\nNota 3: ")
               .append(notas[2]).append("\nNota 4: ").append(notas[3]).append("\nMédia final: ").append(calcularMedia());
       return sb.toString();
   }
}