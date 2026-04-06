
package br.edu.utfpr.temperatura;

public class Temperatura {
    private String cidade;
    private double[] temperaturas;
    
    public Temperatura(){
        temperaturas = new double[7]; //cria o array
    }
    
    public Temperatura(String cidade, double[] temperaturas){
       this.cidade = cidade;
       this.temperaturas = temperaturas;
    }
    
    public void setTemperatura(int indice, double valor){
        if(indice >= 0 && indice < temperaturas.length){
            temperaturas[indice] = valor;
        }
    }
    public double getTemperatura(int indice){
        if(indice >= 0 && indice < temperaturas.length){
            return temperaturas[indice];
        } else{
            return -999;
        }
    }
    
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public double calcularMedia(){
        double soma = 0;
        for(double t: temperaturas){
            soma += t;
        }
        return soma/temperaturas.length;
    }
    
    public double maiorTemperatura(){
        double maior = temperaturas[0];
        for(double t: temperaturas){
            if(t > maior){
                maior = t;
            }
        }
        return maior;
    }
    
    public double menorTemperatura(){
        double menor = temperaturas[0];
        for(double t: temperaturas){
            if(t < menor){
                menor = t;
            }
        }
        return menor;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Registros de temperaturas de ").append(cidade).append(":\n");
        sb.append("Temperaturas da semana: ");
        
        for(int i = 0; i<temperaturas.length;i++){
            sb.append(temperaturas[i]);
            if(i < temperaturas.length -1){
                sb.append(", ");
            }
            
        }
         return sb.toString();
    }
   
}
