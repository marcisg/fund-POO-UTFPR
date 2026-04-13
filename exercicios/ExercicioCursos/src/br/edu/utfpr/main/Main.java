package br.edu.utfpr.main;

import br.edu.utfpr.cursos.MarketingDigital;
import br.edu.utfpr.cursos.Programacao;

public class Main {
    public static void main(String[] args) {
        Programacao programacao = new Programacao("Programação", "Loiane Groner", 120, "Java", 50.0, 25.0);
        MarketingDigital marketing = new MarketingDigital("Marketing de Conteúdo", "Carlos Soares", 160, "Udemy", 30.0, 250.0, 50.0);
        
        System.out.println("-------------- Curso de Programação --------------\n");
        System.out.println(programacao.toString() + "\nCusto total para o curso de Programação: " + programacao.calcularCustoTotal());
        System.out.println("\n\n-------------- Curso de Marketing --------------\n");
        System.out.println(marketing.toString() + "\nCusto total para o curso de Marketing: " + marketing.calcularCustoTotal());
    }
}
