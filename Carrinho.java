package ecommerce;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado ao carrinho: " + produto.getNome());
    }

    public void removerProduto(Produto produto) {
        if (produtos.remove(produto)) {
            System.out.println("Produto removido do carrinho: " + produto.getNome());
        } else {
            System.out.println("Produto nao encontrado no carrinho.");
        }
    }

    public void listarProdutos() {
        System.out.println("Produtos no carrinho:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto);
        }
        System.out.println("Subtotal: R$ " + String.format("%.2f", calcularSubtotal()));
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (Produto produto : produtos) {
            subtotal += produto.getPreco();
        }
        return subtotal;
    }

    public ArrayList<Produto> getProdutos() {
        return new ArrayList<>(produtos);
    }

    public void limpar() {
        produtos.clear();
    }
}
