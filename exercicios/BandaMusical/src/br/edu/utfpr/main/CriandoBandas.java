package br.edu.utfpr.main;

import br.edu.utfpr.dao.BandaDao;
import br.edu.utfpr.entidades.Banda;
import br.edu.utfpr.entidades.Instrumento;
import br.edu.utfpr.entidades.Musico;
import br.edu.utfpr.enums.TipoInstrumento;
import java.util.List;
import java.util.Scanner;

public class CriandoBandas {
    
    public static void main(String[] args) {
        
        Instrumento guitarra = new Instrumento("Guitarra", TipoInstrumento.CORDA);
        Instrumento bateria = new Instrumento("Bateria", TipoInstrumento.PERCUSSAO);
        Instrumento flauta = new Instrumento("Flauta", TipoInstrumento.SOPRO);
        Instrumento baixo  = new Instrumento("Baixo", TipoInstrumento.CORDA);

        Musico cantor1 = new Musico("Carlos de Souza", guitarra);
        Musico cantor2 = new Musico("Ana dos Santos", bateria);
        Musico cantor3 = new Musico("Pedro Andrade", flauta);
        Musico cantor4 = new Musico("Antony Garcia", baixo);

        Musico cantor5 = new Musico("Mariana Soares", baixo);
        Musico cantor6 = new Musico("João Almeida", bateria);
        Musico cantor7 = new Musico("Lucas Toledo", guitarra);

        Banda banda1 = new Banda("rock", cantor1);
        banda1.addMusico(cantor2);
        banda1.addMusico(cantor3);
        banda1.addMusico(cantor4);

        Banda banda2 = new Banda("Jazz", cantor5);
        banda2.addMusico(cantor6);
        banda2.addMusico(cantor7);

        BandaDao dao = new BandaDao();
        dao.adicionarBanda(banda1);
        dao.adicionarBanda(banda2);
        
        System.out.println("=== Bandas Cadastradas ===");
        dao.imprimirBanda();
 
        System.out.println("Banda Pesquisada");
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome da banda a ser pesquisada: ");
        String nomeBusca = scan.nextLine();
        List<Banda> resultadoPesquisa = dao.pesquisarPorNome(nomeBusca);
        if (resultadoPesquisa != null) {
            System.out.println(resultadoPesquisa);
        } else {
            System.out.println("Nome não encontrado dentre as bandas.");
        }
 
        if (dao.removerBanda(1)) {
            System.out.println("\nBanda com id " + 1 + " removida.");
        } else {
            System.out.println("\nNenhuma banda encontrada com o id " + 1 + ".");
        }
 
        System.out.println("\nBandas após remoção:");
        dao.imprimirBanda();
 
        scan.close();
    }
}
