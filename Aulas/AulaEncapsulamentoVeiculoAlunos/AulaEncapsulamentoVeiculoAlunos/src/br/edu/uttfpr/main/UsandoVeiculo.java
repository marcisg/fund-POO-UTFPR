
package br.edu.uttfpr.main;

import br.edu.utfpr.entidade.Veiculo;

public class UsandoVeiculo {

    public static void main(String[] args) {
        
        Veiculo onix = new Veiculo();
        onix.setMarca("Chevrolet");
        onix.setModelo("Onix");
        onix.setVelocidadeMaxima(200);
        
        System.out.println(onix);
        
        System.out.println("\n\n");
         
        Veiculo corolla = new Veiculo("Toyota", "Corolla", 260);
        System.out.println(corolla);
        
        int incremento = 11;
        System.out.println("\nAcelerando o corolla...");
        while(corolla.acelerar(incremento)){
            System.out.println("Velocidade atual: " + corolla.getVelocidade());
        }
        
        System.out.println("Velocidade máxima atingida: " + corolla.getVelocidadeMaxima());
        
        int decremento = 16;
        System.out.println("\nFreando o corolla...");
        while(corolla.desacelerar(decremento)){
            System.out.println("Velocidade atual: " + corolla.getVelocidade());
        }
        
        System.out.println("O carro parou.");
    }
    
}