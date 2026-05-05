package br.edu.utfpr.dao;

 
import br.edu.utfpr.entidades.Receita;
import java.util.ArrayList;
import java.util.List;
 
public class ReceitaDao {
    private List<Receita> receitas;
 
    public ReceitaDao() {
        this.receitas = new ArrayList<>();
    }
 
    public void inserirReceita(Receita receita) {
        receitas.add(receita);
    }
 
    public void excluirReceita(int id) {
        String nomeRemovido = null;

        for (Receita r : receitas) {
            if (r.getId() == id) {
                nomeRemovido = r.getNome();
                break;
            }
        }

        boolean removido = receitas.removeIf(r -> r.getId() == id);

        if (removido) {
            System.out.println("Receita com id " + id + " '" + nomeRemovido + "' excluída com sucesso!");
        } else {
            System.out.println("Receita com id " + id + " não encontrada.");
        }
    }
 
    public Receita pesquisarReceita(String nome) {
        for (Receita r : receitas) {
            if (r.getNome().equalsIgnoreCase(nome)) {
                return r;
            }
        }
        return null;
    }
 
    public void imprimirReceitas() {
        if (receitas.isEmpty()) {
            System.out.println("Nenhuma receita cadastrada.");
            return;
        }
        for (Receita r : receitas) {
            System.out.println(r);
        }
    }
    
    public void ordenarReceitas() {
        receitas.sort((r1, r2) -> {
            return Integer.compare(r1.getTempoPreparo(), r2.getTempoPreparo());
        });
    }
 
    public List<Receita> getReceitas() {
        return receitas;
    }
}
