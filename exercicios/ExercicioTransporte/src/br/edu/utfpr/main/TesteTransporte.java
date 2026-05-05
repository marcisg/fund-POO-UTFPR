package br.edu.utfpr.main;

import br.edu.utfpr.transporte.Aviao;
import br.edu.utfpr.transporte.Caminhao;

public class TesteTransporte {
    public static void main(String[] args) {
       Caminhao caminhao = new Caminhao(200, 2000, 20);
       Aviao aviao = new Aviao(5000, 10000, 200);
       double carga = 5000;
       
       if(caminhao.adicionarCarga(carga)){
           System.out.println("Carga de "+ carga + " kg adicionada no caminhão com sucesso!");
       } else{
           System.out.println("Não foi possível adicionar " + carga+ " kg. Excede a capacidade máxima do caminhão.");
       }
       
       if(aviao.adicionarCarga(carga)){
           System.out.println("Carga de "+ carga + " kg adicionada no avião com sucesso!");
       } else{
           System.out.println("Não foi possível adicionar " + carga+ " kg. Excede a capacidade máxima do avião.");
       }
       
        System.out.println("\n======Caminhão=======");
        System.out.println("\nDistância: " + caminhao.getDistancia()+ "\nPeso da carga: " + caminhao.getPesoCarga() 
                + "\nCusto total: " + caminhao.calcularCusto());
        System.out.println("\n======Avião=======");
        System.out.println("\nDistância: " + aviao.getDistancia()+ "\nPeso da carga: " + aviao.getPesoCarga() 
                + "\nCusto total: " + aviao.calcularCusto());
        
        carga = 500;
       
       if(caminhao.removerCarga(carga)){
           System.out.println("\nCarga de "+ carga + " kg removida do caminhão com sucesso!");
           System.out.println("\nApós remover " + carga + " kg do caminhão: " );
           System.out.println("\n======Caminhão=======");
           System.out.println("\nDistância: " + caminhao.getDistancia()+ "\nPeso da carga: " + caminhao.getPesoCarga() 
                + "\nCusto total: " + caminhao.calcularCusto());
       } else{
           System.out.println("\nNão foi possível remover " + carga+ " kg. O caminhão não contem o valor total.");
       }
       if(aviao.removerCarga(carga)){
           System.out.println("\nCarga de "+ carga + " kg removida do avião com sucesso!");
           System.out.println("\n\nApós remover " + carga + " kg do avião: " );
           System.out.println("\n======Avião=======");
           System.out.println("\nDistância: " + aviao.getDistancia()+ "\nPeso da carga: " + aviao.getPesoCarga() 
                + "\nCusto total: " + aviao.calcularCusto());
       } else{
           System.out.println("\nNão foi possível remover " + carga+ " kg. O avião não contem o valor total.");
       }
    }
}
