package ecommerce;

public class Debito implements FormaPagamento {
    @Override
    public String getNome() {
        return "Debito";
    }

    @Override
    public double calcularValor(double valorPedido) {
        return valorPedido;
    }

    @Override
    public void pagar(double valorPedido) {
        System.out.println("Pagamento no cartao de debito: R$ " + String.format("%.2f", valorPedido));
    }
}
