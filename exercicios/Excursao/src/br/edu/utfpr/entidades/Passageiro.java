
package br.edu.utfpr.entidades;

public class Passageiro extends Pessoa {
    private String documento;
    private int idade;

    public Passageiro(String documento, int idade, String nome) {
        super(nome);
        this.documento = documento;
        this.idade = idade;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNome: ").append(super.getNome());
        sb.append(" | Documento: ").append(documento);
        sb.append(" | Idade: ").append(idade);
        return sb.toString();
    } 
    
}
