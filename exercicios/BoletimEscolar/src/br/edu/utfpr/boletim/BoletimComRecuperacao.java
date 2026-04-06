package br.edu.utfpr.boletim;

public class BoletimComRecuperacao extends Aluno{
   private double notaRecuperacao;

   public BoletimComRecuperacao(){

   }

   public BoletimComRecuperacao(String nome, double[] notas, double notaRecuperacao) {
       super(nome, notas);
       this.notaRecuperacao = notaRecuperacao;
   }

   public void setNotaRecuperacao(double notaRecuperacao) {
       this.notaRecuperacao = notaRecuperacao;
   }

   public double getNotaRecuperacao() {
       return notaRecuperacao;
   }

   public double calcularMediaFinal() {
       return (calcularMedia() + notaRecuperacao)/2;
   }

   public String verificarAprovacao(){
       if(calcularMediaFinal() >= 6){
           return "Aprovado após recuperação.";
       } else{
           return "Reprovado após recuperação.";
       }
   }

   @Override
   public String toString(){
       return super.toString() + "\nNota da recuperação: " + notaRecuperacao + "\nMédia final: " + calcularMediaFinal() + "\nSituação: " +
               verificarAprovacao();
   }
}