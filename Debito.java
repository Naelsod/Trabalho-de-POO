package pagamento;

public class Debito implements Pagamento {

    @Override
    public double calcularValorFinal(double valor) {
        return valor;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento no Débito");
        System.out.println("Valor: R$ " + calcularValorFinal(valor));
    }

}