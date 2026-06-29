package pagamento;

public class Boleto implements Pagamento {

    @Override
    public double calcularValorFinal(double valor) {
        return valor;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento por Boleto");
        System.out.println("Valor: R$ " + calcularValorFinal(valor));
    }

}