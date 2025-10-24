package br.com.exemplo.pagamento;

public class PagamentoDinheiro implements Pagamento {
    @Override
    public double calcularPagamento(double valor) {
        return valor * 0.90;
    }

    @Override
    public String emitirRecibo(double valor) {
        double total = calcularPagamento(valor);
        return "Recibo (Dinheiro):\nValor: R$" + valor +
               "\nDesconto (10%): R$" + (valor * 0.10) +
               "\nTotal: R$" + total;
    }
}
