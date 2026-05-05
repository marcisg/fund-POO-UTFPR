package br.edu.utfpr.entidades;

import br.edu.utfpr.enums.Dificuldade;

public class Salgado extends Receita {
    private String tipoProteina;
 
    public Salgado(String nome, int tempoPreparo, Dificuldade dificuldade, String tipoProteina) {
        super(nome, tempoPreparo, dificuldade);
        this.tipoProteina = tipoProteina;
    }
 
    public String getTipoProteina() { 
        return tipoProteina; 
    }
    
    public void setTipoProteina(String tipoProteina) { 
        this.tipoProteina = tipoProteina; 
    }

   /* @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Salgado");
        sb.append(" | Proteína: ").append(tipoProteina);
        sb.append("\n");
        return sb.toString();
    }*/
}
