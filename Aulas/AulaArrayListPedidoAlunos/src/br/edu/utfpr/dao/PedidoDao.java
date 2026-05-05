
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.ItemPedido;
import br.edu.utfpr.entidades.Pedido;
import java.util.ArrayList;
import java.util.List;


public class PedidoDao {
    private List<Pedido> listaPedido;
    
    public PedidoDao() {
        this.listaPedido = new ArrayList<>();
    }

    public void addPedido(Pedido pedido) {
        if(listaPedido != null){
            listaPedido.add(pedido);
        }
    }
    
    public String imprimirListaPedido(){
        StringBuilder sb = new StringBuilder();
        for(Pedido p: listaPedido){
            sb.append("\nPedido==> ").append(p.getId()).append("\n").append("Data do pedido: ").append(p.getData()).
                    append("\n").append("Cliente: ").append(p.getCliente().getNome()).append("Itens do pedido: \n");
            for(ItemPedido ip: p.getListaItens()){
                sb.append("ID: ").append(ip.getId()).append(" | Produto: ").append(ip.getProduto().getDescricao()).
                        append(" | Preço: ").append(ip.getProduto().getPreco()).append("\n");
            }
        }
        return sb.toString();
    }
    
    
    
}
