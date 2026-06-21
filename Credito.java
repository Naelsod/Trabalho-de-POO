package ecommerce;

public class Credito implements FormaPagamento {
    @Override
    public String getNome() {
        return "Credito";
    }

    @Override
    public double calcularValor(double valorPedido) {
        return valorPedido;
    }

    @Override
    public void pagar(double valorPedido) {
        System.out.println("Pagamento no cartao de credito: R$ " + String.format("%.2f", valorPedido));
    }
}
