package br.edu.utfpr.main;

import br.edu.utfpr.dao.ReceitaDao;
import br.edu.utfpr.entidades.Doce;
import br.edu.utfpr.entidades.Ingrediente;
import br.edu.utfpr.entidades.Receita;
import br.edu.utfpr.entidades.Salgado;
import br.edu.utfpr.enums.Dificuldade;

public class LivroDeReceitas {
    public static void main(String[] args) {
 
        ReceitaDao dao = new ReceitaDao();
 
        // Torta de Bolacha (Doce)
        Doce torta = new Doce("Torta de Bolacha", 40, Dificuldade.FACIL, true);
        torta.adicionarIngrediente(new Ingrediente("Bolacha Maizena", "200g"));
        torta.adicionarIngrediente(new Ingrediente("Leite condensado", "1 lata"));
        torta.adicionarIngrediente(new Ingrediente("Creme de leite", "1 caixa"));
        torta.adicionarIngrediente(new Ingrediente("Chocolate em pó", "3 colheres"));

        // Panqueca (Salgado)
        Salgado panqueca = new Salgado("Panqueca", 30, Dificuldade.MEDIA, "Carne");
        panqueca.adicionarIngrediente(new Ingrediente("Farinha de trigo", "2 xícaras"));
        panqueca.adicionarIngrediente(new Ingrediente("Ovos", "2 unidades"));
        panqueca.adicionarIngrediente(new Ingrediente("Leite", "500ml"));
        panqueca.adicionarIngrediente(new Ingrediente("Carne moída", "400g"));

        // Pastel (Salgado)
        Salgado pastel = new Salgado("Pastel", 60, Dificuldade.DIFICIL, "Queijo");
        pastel.adicionarIngrediente(new Ingrediente("Farinha de trigo", "3 xícaras"));
        pastel.adicionarIngrediente(new Ingrediente("Água morna", "200ml"));
        pastel.adicionarIngrediente(new Ingrediente("Sal", "1 colher"));
        pastel.adicionarIngrediente(new Ingrediente("Queijo mussarela", "300g"));

        // Brigadeiro (Doce)
        Doce brigadeiro = new Doce("Brigadeiro", 20, Dificuldade.FACIL, true);
        brigadeiro.adicionarIngrediente(new Ingrediente("Leite condensado", "1 lata"));
        brigadeiro.adicionarIngrediente(new Ingrediente("Chocolate em pó", "2 colheres"));
        brigadeiro.adicionarIngrediente(new Ingrediente("Manteiga", "1 colher"));
        brigadeiro.adicionarIngrediente(new Ingrediente("Granulado", "a gosto"));

        // Omelete (Salgado)
        Salgado omelete = new Salgado("Omelete", 10, Dificuldade.FACIL, "Ovos");
        omelete.adicionarIngrediente(new Ingrediente("Ovos", "3 unidades"));
        omelete.adicionarIngrediente(new Ingrediente("Queijo", "100g"));
        omelete.adicionarIngrediente(new Ingrediente("Presunto", "100g"));
        omelete.adicionarIngrediente(new Ingrediente("Sal", "a gosto"));

        // Salada Simples (Salgado)
        Salgado salada = new Salgado("Salada Simples", 15, Dificuldade.FACIL, "Vegetais");
        salada.adicionarIngrediente(new Ingrediente("Alface", "1 maço"));
        salada.adicionarIngrediente(new Ingrediente("Tomate", "2 unidades"));
        salada.adicionarIngrediente(new Ingrediente("Cenoura", "1 unidade"));
        salada.adicionarIngrediente(new Ingrediente("Azeite", "a gosto"));
        
        dao.inserirReceita(torta);
        dao.inserirReceita(panqueca);
        dao.inserirReceita(pastel);
        dao.inserirReceita(brigadeiro);
        dao.inserirReceita(omelete);
        dao.inserirReceita(salada);

        System.out.println("=== Receitas Cadastradas ===");
        dao.imprimirReceitas();

        System.out.println("\n=== Ingredientes por Receita ===");
        for (var r : dao.getReceitas()) {
            r.listarIngredientes();
            System.out.println();
        }

        System.out.println("=== Pesquisando Receita ===");
        String nomeBusca = "Torta de Bolacha";
        System.out.println("Receita pesquisada: " + nomeBusca);
        Receita encontrada = dao.pesquisarReceita(nomeBusca);
        if (encontrada != null) {
            System.out.println("Resultado: " + encontrada);
        } else {
            System.out.println("Receita não encontrada.");
        }

        System.out.println("\n=== Excluindo Receita ===");
        dao.excluirReceita(2); // remove Panqueca

        System.out.println("\n=== Receitas Após Exclusão ===");
        dao.imprimirReceitas();

        System.out.println("\n=== Receitas ordenadas por tempo de preparo ===");
        dao.ordenarReceitas();
        dao.imprimirReceitas();
    }
}