package br.edu.utfpr.entidades;

public class Guia extends Pessoa {
    private String registroGuia;
    private String telefone;

    public Guia(String registroGuia, String telefone, String nome) {
        super(nome);
        this.registroGuia = registroGuia;
        this.telefone = telefone;
    }

    public String getRegistroGuia() {
        return registroGuia;
    }

    public void setRegistroGuia(String registroGuia) {
        this.registroGuia = registroGuia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nGuia: ").append(super.getNome());
        sb.append(" | Número de registro: ").append(registroGuia);
        sb.append(" | Telefone: ").append(telefone);
        return sb.toString();
    }
    
    
}
