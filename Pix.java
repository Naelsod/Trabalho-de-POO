package pagamento;

public class Pix implements Pagamento {

    @Override
    public double calcularValorFinal(double valor) {
        return valor * 0.85; // desconto de 15%
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento via PIX");
        System.out.println("Valor original: R$ " + valor);
        System.out.println("Desconto: 15%");
        System.out.println("Valor final: R$ " + calcularValorFinal(valor));
    }

}