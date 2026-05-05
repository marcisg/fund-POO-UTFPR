package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class PessoaDao {
    private List<Pessoa> listaPessoa;

    public PessoaDao(){
        listaPessoa = new ArrayList();// ou assim ArrayList<>();
    }
    
    public void inserir(Pessoa pessoa){
        if(listaPessoa != null){
             listaPessoa.add(pessoa);
        }
    }
    
    public String imprimir(){
        StringBuilder sb = new StringBuilder();
        listaPessoa.forEach((pessoa)->{
            sb.append(pessoa).append("\n");
        });
        return sb.toString();
    }
    
    public void ordenar(){
        listaPessoa.sort((p1, p2) -> {
            return (p1.getNome().compareTo(p2.getNome()));
        });
    }
    
    public boolean excluir(int codigo) {
        return listaPessoa.removeIf(p -> p.getCodigo() == codigo);
    }
    
    public Pessoa buscarPorNome(String nome) {
        for (Pessoa p : listaPessoa) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public List<Pessoa> buscarPorNomeContains(String nome) {
        List<Pessoa> novaLista = new ArrayList<>(); 
        for (Pessoa p : listaPessoa) {
            if (p.getNome().toLowerCase().contains(nome.toLowerCase())) {
                novaLista.add(p); 
            }
        }
        return novaLista;
    }
}
