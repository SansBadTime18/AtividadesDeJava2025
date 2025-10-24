package br.com.exemplo.pagamento;

public class PagamentoCartao implements Pagamento {
    @Override
    public double calcularPagamento(double valor) {
        return valor * 1.05;
    }

    @Override
    public String emitirRecibo(double valor) {
        double total = calcularPagamento(valor);
        return "Recibo (Cartão):\nValor: R$" + valor +
               "\nTaxa (5%): R$" + (valor * 0.05) +
               "\nTotal: R$" + total;
    }
}
