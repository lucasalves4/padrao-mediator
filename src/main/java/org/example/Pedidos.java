package org.example;

public class Pedidos {

    private static Pedidos instancia = new Pedidos();

    private Pedidos() {}

    public static Pedidos getInstancia() {
        return instancia;
    }

    public String receberPedidoEletrodomesticos(String mensagem) {
        return "O setor de Pedidos agradece seu interesse.\n"+
                ">>" + Eletrodomesticos.getInstancia().receberPedido(mensagem);
    }

    public String receberPagamentoEletrodomesticos(String mensagem) {
        return "O setor de Pedidos agradece seu interesse.\n"+
                ">>" + Eletrodomesticos.getInstancia().receberPagamento(mensagem);
    }
}
