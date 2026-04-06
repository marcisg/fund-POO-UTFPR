
package br.edu.utfpr.main;

import br.edu.utfpr.temperatura.Temperatura;
import br.edu.utfpr.temperatura.TemperaturaLab;
import java.util.Scanner;

public class UsandoTemperatura {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome da cidade: ");
        String cidade = scan.nextLine(); // lê a frase toda mesmo com espaço
        
        Temperatura temp = new Temperatura();
        temp.setCidade(cidade);
        
        //leitura do array
        for(int i = 0;i < 7;i++){
            System.out.println("Informe a temperatura do dia " + (i+1) + ": ");
            double t = scan.nextDouble();
            temp.setTemperatura(i, t);
        }
       
        
        //resultados
        System.out.println("\nResultado: ");
        System.out.println(temp);
        System.out.println(String.format("Média: %.2f", temp.calcularMedia()));
        System.out.println(String.format("Maior temperatura: %.2f ", temp.maiorTemperatura()));
        System.out.println(String.format("Menor temperatura: %.2f", temp.menorTemperatura()));
        
        
        //======================
        System.out.println("Informe a temperatura máxima permitida: ");
        double tempMax = scan.nextDouble();
        TemperaturaLab tempLab = new TemperaturaLab();
        tempLab.setCidade(temp.getCidade());
        tempLab.setLimiteTemperatura(tempMax);
        
        for (int i = 0; i < 7; i++) {
            tempLab.setTemperatura(i, temp.getTemperatura(i));
        }
        
        System.out.println("=========DADOS DA TEMPERATURA DO LABORATÓRIO===========");
        System.out.println(tempLab);
        System.out.println("\n===============CONTROLE DO LABORATÓRIO===========");
        if(tempLab.isSeguro()){
            System.out.println("Temperatura está dentro do limite de segurança.");
        } else{
            System.out.println("ALERTA! Temperatura está acima do limite de segurança.");
        }
        scan.close();
    }
}
