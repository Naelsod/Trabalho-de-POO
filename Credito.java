package pagamento;

public class Credito implements Pagamento {

    @Override
    public double calcularValorFinal(double valor) {
        return valor;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento no Crédito");
        System.out.println("Valor: R$ " + calcularValorFinal(valor));
    }

}