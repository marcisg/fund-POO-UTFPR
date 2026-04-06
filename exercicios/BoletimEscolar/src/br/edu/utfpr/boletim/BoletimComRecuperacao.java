package br.edu.utfpr.boletim;

public class BoletimComRecuperacao extends BoletimEscolar{
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
       double mediaFinal = (calcularMedia() + notaRecuperacao)/2;
       if(mediaFinal >= 7){
           return 7;
       }
       return mediaFinal;
   }

   public String verificarAprovacao(){
       String situacao;
       if(calcularMediaFinal() >= 7){
           situacao = "Aprovado após recuperação.";
       } else{
           situacao =  "Reprovado após recuperação.";
       }
       return situacao;
   }

   @Override
   public String toString(){
       return super.toString() + "\nNota da recuperação: " + notaRecuperacao + "\nMédia final: " + calcularMediaFinal();
   }
}