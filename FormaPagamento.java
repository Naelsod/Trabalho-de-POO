package pagamento;

public interface Pagamento {

    double calcularValorFinal(double valor);

    void realizarPagamento(double valor);

}