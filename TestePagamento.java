package br.com.exemplo.pagamento;

public class TestePagamento {
    public static void main(String[] args) {
        double valor = 100.0;
        Pagamento cartao = new PagamentoCartao();
        Pagamento dinheiro = new PagamentoDinheiro();

        System.out.println(cartao.emitirRecibo(valor));
        System.out.println();
        System.out.println(dinheiro.emitirRecibo(valor));
    }
}
