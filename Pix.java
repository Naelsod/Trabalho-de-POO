package ecommerce;

public class Pix implements FormaPagamento {
    private static final double DESCONTO = 0.15;

    @Override
    public String getNome() {
        return "PIX";
    }

    @Override
    public double calcularValor(double valorPedido) {
        return valorPedido - (valorPedido * DESCONTO);
    }

    @Override
    public void pagar(double valorPedido) {
        System.out.println("Pagamento via PIX com 15% de desconto.");
        System.out.println("Valor original: R$ " + String.format("%.2f", valorPedido));
        System.out.println("Valor final: R$ " + String.format("%.2f", calcularValor(valorPedido)));
    }
}
