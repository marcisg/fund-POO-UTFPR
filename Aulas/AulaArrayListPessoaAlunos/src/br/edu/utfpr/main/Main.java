/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.main;

import br.edu.utfpr.dao.PessoaDao;
import br.edu.utfpr.entidades.Pessoa;
import br.edu.utfpr.entidades.PessoaFisica;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Andreia
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa1 = new PessoaFisica(121212121L, "Ana", "ana@ana", "(46) 2333-2322", 33);
        Pessoa pessoa2 = new PessoaFisica(981212121L, "Fernando", "fernando@fernando", "(46) 3332-6678", 23);
        Pessoa pessoa3 = new PessoaFisica(767676777L, "Carlos", "carlos@carlos", "(46) 9898-8777", 45);
        Pessoa pessoa4 = new PessoaFisica(767676777L, "Ana Maria", "carlos@carlos", "(46) 9898-8777", 45);
        
        PessoaDao pessoaDao = new PessoaDao(); //criando o ArrayList
        //inserir as pessoas na Lista
        pessoaDao.inserir(pessoa1);
        pessoaDao.inserir(pessoa2);
        pessoaDao.inserir(pessoa3);
        pessoaDao.inserir(pessoa4);


        boolean executando = true;

        while (executando) {
            // Exibe as opções do menu
            System.out.println("Selecione uma opção:\n"
                    + "1. Exibir lista de pessoas\n"
                    + "2. Ordenar lista de pessoas\n"
                    + "3. Excluir pessoa\n"
                    + "4. Buscar pessoa por nome\n"
                    + "5. Buscar pessoa por mais de um nome\n"
                    + "6. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir o enter

            switch (opcao) {
                case 1:
                    System.out.println("Lista de pessoas:");
                    System.out.println(pessoaDao.imprimir());
                    break;
                case 2:
                    System.out.println("Lista de pessoas ordenada:");
                    pessoaDao.ordenar();
                    System.out.println(pessoaDao.imprimir());
                    break;
                case 3:
                    System.out.println(" Informe o código do registro que deseja excluir.");
                    int codigoExcluir = scanner.nextInt();
                    if(pessoaDao.excluir(codigoExcluir)){
                        System.out.println("Pessoa excluída com sucesso.");
                    }else{
                        System.out.println("Não foi possível excluir a pessoa.");
                    }
                    break;
                case 4:
                    System.out.println("Informe o nome da pessoa que deseja buscar.");
                    String nomeProcurado = scanner.nextLine();
                    if(pessoaDao.buscarPorNome(nomeProcurado) != null ){
                        System.out.println(pessoaDao.buscarPorNome(nomeProcurado));
                    } else{
                        System.out.println("Não foi possível encontrar essa pessoa.");
                    }
                    break;
                case 5:
                    System.out.println("Informe o nome da pessoa que deseja buscar.");
                    String nomeProcuradoContains = scanner.nextLine();
                    List<Pessoa> pessoasEncontradas = pessoaDao.buscarPorNomeContains(nomeProcuradoContains);
                    if(!pessoasEncontradas.isEmpty()){
                        System.out.println("Pessoas encontradas: ");
                        pessoasEncontradas.forEach (p -> System.out.println(p));
                    } else{
                        System.out.println("Nenhuma pessoa encontrada.");
                    }
                    break;
                case 6:
                    executando = false; // Sai do loop
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
            }
        }
        scanner.close();

    }

}
