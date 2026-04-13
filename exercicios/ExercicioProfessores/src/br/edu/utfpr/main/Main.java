package br.edu.utfpr.main;

import br.edu.utfpr.professor.ProfessorEfetivo;
import br.edu.utfpr.professor.ProfessorHorista;

public class Main {
    public static void main(String[] args) {
        ProfessorEfetivo profEfetivo = new ProfessorEfetivo("Ana Maria", "ana.maria@hotmail.com", 900.00, 4000.00);
        ProfessorHorista profHorista = new ProfessorHorista("João Silva", "joao.silva@gmail.com", 240, 15.00);
        
        System.out.println("===========PROFESSOR EFETIVO=========== \n");
        System.out.println(profEfetivo.toString()+"\nSalário total: " + profEfetivo.calcularSalarioTotal());
        System.out.println("\n\n===========PROFESSOR HORISTA=========== \n");
        System.out.println(profHorista.toString()+"\nSalário total: " + profHorista.calcularSalarioTotal()+ "\n");
        
    }
    
}
