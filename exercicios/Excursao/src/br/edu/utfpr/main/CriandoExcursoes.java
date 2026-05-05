package br.edu.utfpr.main;

import br.edu.utfpr.dao.ExcursaoDao;
import br.edu.utfpr.entidades.Excursao;
import br.edu.utfpr.entidades.Guia;
import br.edu.utfpr.entidades.Passageiro;
import br.edu.utfpr.entidades.Veiculo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CriandoExcursoes {
    
    public static void main(String[] args) {
        
        ExcursaoDao dao = new ExcursaoDao();
        

        Excursao ex1 = new Excursao("Foz do Iguaçu", LocalDate.of(2026, 7, 10), new Guia("RG123", "4599999-1111", "Carlos Silva"), 
            new Veiculo("Ônibus", "ABC-1234", 50));
        dao.addPassageiro(new Passageiro("111", 25, "Ana Souza"), ex1);
        dao.addPassageiro(new Passageiro("222", 30, "Bruno Lima"), ex1);
        dao.addPassageiro(new Passageiro("999", 26, "Marcos Pereira"), ex1);
        dao.addPassageiro(new Passageiro("1000", 34, "Luciana Alves"), ex1);

        Excursao ex2 = new Excursao("Curitiba", LocalDate.of(2026, 8, 5),new Guia("RG456", "4198888-2222", "Mariana Costa"),
            new Veiculo("Van", "DEF-5678", 15));
        dao.addPassageiro(new Passageiro("333", 28, "Juliana Rocha"), ex2);
        dao.addPassageiro(new Passageiro("444", 35, "Pedro Alves"), ex2);
        dao.addPassageiro(new Passageiro("1001", 29, "Ricardo Souza"), ex2);
        dao.addPassageiro(new Passageiro("1002", 41, "Patrícia Lima"), ex2);

        Excursao ex3 = new Excursao("Balneário Camboriú",LocalDate.of(2026, 12, 20),new Guia("RG789", "4797777-3333", "Roberto Mendes"),
            new Veiculo("Micro-ônibus", "GHI-9012", 30));
        dao.addPassageiro(new Passageiro("555", 22, "Fernanda Dias"), ex3);
        dao.addPassageiro(new Passageiro("666", 27, "Lucas Martins"), ex3);
        dao.addPassageiro(new Passageiro("1003", 23, "Thiago Fernandes"), ex3);
        dao.addPassageiro(new Passageiro("1004", 36, "Aline Barbosa"), ex3);

        Excursao ex4 = new Excursao("Gramado", LocalDate.of(2026, 6, 15), new Guia("RG321", "5196666-4444", "Patrícia Gomes"),
            new Veiculo("Ônibus", "JKL-3456", 45));
        dao.addPassageiro(new Passageiro("777", 31, "Camila Ferreira"), ex4);
        dao.addPassageiro(new Passageiro("888", 29, "Rafael Souza"), ex4);
        dao.addPassageiro(new Passageiro("1005", 27, "Gustavo Ribeiro"), ex4);
        dao.addPassageiro(new Passageiro("1006", 32, "Carla Mendes"), ex4);
        
        dao.inserirExcursao(ex1);
        dao.inserirExcursao(ex2);
        dao.inserirExcursao(ex3);
        dao.inserirExcursao(ex4);

        List<Excursao> listaExcursoes = new ArrayList<>();
        System.out.println(dao.imprimeExcursoes());
        System.out.println(dao.listaGeralPassageiros());
        
        System.out.println("Excluindo passageiro Camila Ferreira da Excursão para Gramado");
        dao.excluirPassageiroExcursao(ex4, "777");
        System.out.println(dao.imprimeExcursoes());
        System.out.println(dao.listaGeralPassageiros());
        
    }
        
}

