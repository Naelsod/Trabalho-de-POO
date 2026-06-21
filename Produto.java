package ecommerce;

public class Produto {
    private static int contador = 1;

    private int id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.id = contador++;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return id + " - " + nome + " | R$ " + String.format("%.2f", preco);
    }
}
