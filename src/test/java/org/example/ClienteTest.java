package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveReceberPedidoEletrodomestico() {
        Cliente cliente = new Cliente();
        assertEquals("O setor de Pedidos agradece seu interesse.\n" +
                        ">>Eletrodoméstico adicionado ao seu carrinho com sucesso: Geladeira Brastemp",
                cliente.adicionarCarrinhoEletrodomesticos("Geladeira Brastemp"));
    }

    @Test
    void deveReceberPagamentoEletrodomestico() {
        Cliente cliente = new Cliente();
        assertEquals("O setor de Pedidos agradece seu interesse.\n" +
                        ">>O pagamento do seu eletrodoméstico foi recebido: Geladeira Brastemp",
                cliente.realizarPagamentoEletrodomesticos("Geladeira Brastemp"));
    }
}