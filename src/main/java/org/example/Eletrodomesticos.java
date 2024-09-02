package org.example;

public class Eletrodomesticos implements Setor{

    private static Eletrodomesticos instancia = new Eletrodomesticos();

    private Eletrodomesticos() {}

    public static Eletrodomesticos getInstancia() {
        return instancia;
    }

    public String receberPedido(String mensagem) {
        return "Eletrodoméstico adicionado ao seu carrinho com sucesso: " + mensagem;
    }

    public String receberPagamento(String mensagem) {
        return "O pagamento do seu eletrodoméstico foi recebido: " + mensagem;
    }
}
