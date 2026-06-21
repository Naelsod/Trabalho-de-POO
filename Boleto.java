package ecommerce;

public class Boleto implements FormaPagamento {
    @Override
    public String getNome() {
        return "Boleto";
    }

    @Override
    public double calcularValor(double valorPedido) {
        return valorPedido;
    }

    @Override
    public void pagar(double valorPedido) {
        System.out.println("Boleto gerado no valor de R$ " + String.format("%.2f", valorPedido));
    }
}
