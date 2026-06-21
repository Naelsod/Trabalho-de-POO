package ecommerce;

public class NotaFiscal {
    private Pedido pedido;

    public NotaFiscal(Pedido pedido) {
        this.pedido = pedido;
    }

    public void imprimir() {
        System.out.println("\n===== NOTA FISCAL =====");
        System.out.println("Pedido: #" + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Tipo de cliente: " + pedido.getCliente().getTipoCliente());
        System.out.println("Documento: " + pedido.getCliente().getDocumento());
        System.out.println("Endereco: " + pedido.getCliente().getEndereco());
        pedido.listarProdutosPedido();
        System.out.println("Pagamento: " + pedido.getFormaPagamento().getNome());
        System.out.println("Entrega: " + pedido.getEntrega().getTipo());
        System.out.println("Total final: R$ " + String.format("%.2f", pedido.calcularTotalFinal()));
        System.out.println("=======================\n");
    }
}
