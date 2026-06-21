package ecommerce;

import java.util.ArrayList;

public class Pedido {
    private static int contador = 1;

    private int id;
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private FormaPagamento formaPagamento;
    private Entrega entrega;
    private NotaFiscal notaFiscal;

    public Pedido(Cliente cliente, ArrayList<Produto> produtos, FormaPagamento formaPagamento, Entrega entrega) {
        this.id = contador++;
        this.cliente = cliente;
        this.produtos = new ArrayList<>(produtos);
        this.formaPagamento = formaPagamento;
        this.entrega = entrega;

        // Composicao: a NotaFiscal nasce junto do Pedido.
        this.notaFiscal = new NotaFiscal(this);

        cliente.adicionarPedido(this);
    }

    public double calcularSubtotalProdutos() {
        double subtotal = 0;
        for (Produto produto : produtos) {
            subtotal += produto.getPreco();
        }
        return subtotal;
    }

    public double calcularTotalAntesDesconto() {
        return calcularSubtotalProdutos() + entrega.calcularFrete();
    }

    public double calcularTotalFinal() {
        return formaPagamento.calcularValor(calcularTotalAntesDesconto());
    }

    public void finalizarPedido() {
        System.out.println("\n===== FINALIZANDO PEDIDO #" + id + " =====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Entrega: " + entrega.getTipo());
        System.out.println("Frete: R$ " + String.format("%.2f", entrega.calcularFrete()));
        System.out.println("Forma de pagamento: " + formaPagamento.getNome());
        formaPagamento.pagar(calcularTotalAntesDesconto());
        entrega.entregar(this);
        System.out.println("Nota Fiscal gerada automaticamente.");
    }

    public void listarProdutosPedido() {
        System.out.println("Produtos do pedido #" + id + ":");
        for (Produto produto : produtos) {
            System.out.println("- " + produto);
        }
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return new ArrayList<>(produtos);
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
}
