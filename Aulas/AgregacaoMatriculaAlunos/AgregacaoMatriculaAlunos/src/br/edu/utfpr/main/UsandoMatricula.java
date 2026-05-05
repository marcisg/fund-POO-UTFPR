/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.main;

import br.edu.utfpr.entidades.Aluno;
import br.edu.utfpr.entidades.Curso;
import br.edu.utfpr.entidades.Disciplina;
import br.edu.utfpr.entidades.Matricula;
import br.edu.utfpr.entidades.Professor;



/**
 *
 * @author Andreia
 */
public class UsandoMatricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Ana Silva", "anasilva@gmail.com", "2023001");
        Aluno aluno2 = new Aluno("Carlos Souza", "carlosouza@gmail.com", "2022005");
        Aluno aluno3 = new Aluno("Beatriz Lima", "beatrizlima@gmail.com", "2023012");
        

        Professor prof1 = new Professor("João Pereira", "joao.pereira@utfpr.edu.br", "123456");
        Professor prof2 = new Professor("Maria Oliveira", "maria.oliveira@utfpr.edu.br", "654321");

        // Criando cursos
        Curso curso1 = new Curso("Engenharia de Software");
        Curso curso2 = new Curso("Medicina");

        // Criando disciplinas
        Disciplina disciplina1 = new Disciplina("Programação Orientada a Objetos", prof1);
        Disciplina disciplina2 = new Disciplina("Anatomia", prof1);
        Disciplina disciplina3 = new Disciplina("Estruturas de Dados", prof2);
        
        Matricula matricula = new Matricula(curso1, aluno1, disciplina1, 2026, 1, "Matrícula criada para o aluno: "+ aluno1.getNome());
        System.out.println(matricula);
        System.out.println("\n");
        Matricula matricula2 = new Matricula(curso2, aluno2, disciplina2, 2025, 1, "Matrícula criada para o aluno: "+ aluno2.getNome());
        System.out.println(matricula2);
    }

}
