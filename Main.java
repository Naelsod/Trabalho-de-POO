package ecommerce;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== E-COMMERCE POO - GRUPO 5 =====");

        // 1) Criar conta do cliente
        Cliente cliente = new Cliente("Daniel Soares", "daniel@email.com", "123.456.789-00");

        // 2) Registrar endereco
        Endereco endereco = new Endereco("Rua Major Gote", "100", "Centro", "Patos de Minas", "MG");
        cliente.registrarEndereco(endereco);

        // 3) Registrar forma de pagamento
        FormaPagamento pagamento = new Pix();
        cliente.registrarFormaPagamento(pagamento);

        // 4) Criar produtos e adicionar ao carrinho
        Produto teclado = new Produto("Teclado mecanico", 250.00);
        Produto mouse = new Produto("Mouse gamer", 120.00);
        Produto monitor = new Produto("Monitor 24 polegadas", 850.00);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(teclado);
        carrinho.adicionarProduto(mouse);
        carrinho.adicionarProduto(monitor);
        carrinho.listarProdutos();

        // 5) Escolher entrega usando interface e polimorfismo
        Entrega entrega = new EntregaRapida();

        // 6) Criar pedido integrando Cliente, Produtos, Pagamento e Entrega
        Pedido pedido = new Pedido(cliente, carrinho.getProdutos(), pagamento, entrega);
        pedido.finalizarPedido();

        // 7) Nota Fiscal existe apenas depois do Pedido
        pedido.getNotaFiscal().imprimir();

        // 8) Atendente virtual atende cliente
        AtendenteVirtual atendente = new AtendenteVirtual("E-Com Bot");
        atendente.atenderCliente(cliente, "Quero acompanhar minha entrega.");
        atendente.listarClientesAtendidos();

        // 9) Exemplo de heranca: Empresa tambem e Cliente, mas possui CNPJ
        Empresa empresa = new Empresa("Mercado Patos", "contato@mercadopatos.com", "12.345.678/0001-99");
        empresa.registrarEndereco(new Endereco("Av. Brasil", "200", "Lagoa Grande", "Patos de Minas", "MG"));
        System.out.println("\nExemplo de heranca: " + empresa);

        // 10) Exemplo claro de polimorfismo com pagamentos
        System.out.println("\n===== TESTE DE POLIMORFISMO EM PAGAMENTOS =====");
        ArrayList<FormaPagamento> formas = new ArrayList<>();
        formas.add(new Pix());
        formas.add(new Credito());
        formas.add(new Debito());
        formas.add(new Boleto());

        double valorTeste = 100.00;
        for (FormaPagamento forma : formas) {
            System.out.println(forma.getNome() + " -> R$ " + String.format("%.2f", forma.calcularValor(valorTeste)));
        }

        cliente.listarPedidos();

        System.out.println("\nSistema testado com sucesso!");
    }
}
