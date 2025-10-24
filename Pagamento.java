package br.com.exemplo.pagamento;

public interface Pagamento {
    double calcularPagamento(double valor);
    String emitirRecibo(double valor);
}
