
package br.edu.utfpr.main;

import br.edu.utfpr.dao.PedidoDao;
import br.edu.utfpr.entidades.Cliente;
import br.edu.utfpr.entidades.ItemPedido;
import br.edu.utfpr.entidades.Pedido;
import br.edu.utfpr.entidades.Produto;
import br.edu.utfpr.entidades.Vendedor;
import java.time.LocalDate;

public class UsandoPedido {

    public static void main(String[] args) {
        

        System.out.println("\n\n--------------Pedido 1----------------");
        
        Cliente cliente1 = new Cliente("Maria da Silva", 217387213);
        Cliente cliente2 = new Cliente("Joana", 2873612);
        Vendedor vendedor1 = new Vendedor(5000, "Paulo", 21732813);
        Vendedor vendedor2 = new Vendedor(10000, "Pedro", 12783821);

        Produto produto1 = new Produto("A", 350);
        Produto produto2 = new Produto("B", 150);
        Produto produto3 = new Produto("C", 200);
        Produto produto4 = new Produto("D", 300);
        Produto produto5 = new Produto("E", 450);
        Produto produto6 = new Produto("F", 600);
        
        Pedido pedido1 = new Pedido(LocalDate.now(), cliente1, vendedor1);
        ItemPedido ip1 = new ItemPedido(produto1, 2);
        ItemPedido ip2 = new ItemPedido(produto2, 1);
        ItemPedido ip3 = new ItemPedido(produto3, 3);
        pedido1.addItem(ip1);
        pedido1.addItem(ip2);
        pedido1.addItem(ip3);
        
        
        Pedido pedido2 = new Pedido(LocalDate.now(), cliente2, vendedor2);
        ItemPedido ip4 = new ItemPedido(produto4, 2);
        ItemPedido ip5 = new ItemPedido(produto5, 1);
        pedido2.addItem(ip4);
        pedido2.addItem(ip5);

        System.out.println("\n\n\n---------Lista de pedidos geral-------------");
        PedidoDao pedidoDao = new PedidoDao();
        pedidoDao.addPedido(pedido1);
        pedidoDao.addPedido(pedido2);
        
        pedido1.ordenarItemPorPreco();
        pedido2.ordenarItemPorPreco();
        
        System.out.println(pedidoDao.imprimirListaPedido());
        System.out.println("\n\n----------------Ordenar itens por preço--------------\n");

    }

}
