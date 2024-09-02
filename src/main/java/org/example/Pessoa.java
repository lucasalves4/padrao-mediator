package org.example;

public class Pessoa {

    public String adicionarCarrinhoEletrodomesticos(String mensagem) {
        return Pedidos.getInstancia().receberPedidoEletrodomesticos(mensagem);
    }

    public String realizarPagamentoEletrodomesticos(String mensagem) {
        return Pedidos.getInstancia().receberPagamentoEletrodomesticos(mensagem);
    }
}
