package br.edu.utfpr.main;

import br.edu.utfpr.computador.Cliente;
import br.edu.utfpr.computador.Computador;
import br.edu.utfpr.enums.TipoComputador;


public class CalculandoManutencao {
    public static void main(String[] args) {

   
        Cliente c1 = new Cliente("Clara", "245.587.765-02");
        Cliente c2 = new Cliente("Miguel", "456.767.876-78");
        Cliente c3 = new Cliente("Monique", "758.785.343-76");

        Computador aparelho1 = new Computador("Asus", 3000, "Intel i5", 2.5, c1, TipoComputador.NOTEBOOK);

        Computador aparelho2 = new Computador("HP", 2500, "Ryzen 5", 3.2, c2, TipoComputador.DESKTOP);

        Computador aparelho3 = new Computador("Windos Server", 8000, "Xeon", 3.8, c3, TipoComputador.SERVIDOR);
        
        System.out.println("=== APRELHO 1 ===");
        System.out.println(aparelho1);
        System.out.println(String.format("Valor da manutenção: %.2f", aparelho1.calcularValorManutencao()));
        System.out.println();

        System.out.println("=== APRELHO 2 ===");
        System.out.println(aparelho2);
        System.out.println(String.format("Valor da manutenção: %.2f", aparelho2.calcularValorManutencao()));
        System.out.println();

        System.out.println("=== APRELHO 3 ===");
        System.out.println(aparelho3);
        System.out.println(String.format("Valor da manutenção: %.2f", aparelho3.calcularValorManutencao()));
    }
}
