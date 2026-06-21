package ecommerce;

public interface FormaPagamento {
    String getNome();
    double calcularValor(double valorPedido);
    void pagar(double valorPedido);
}
