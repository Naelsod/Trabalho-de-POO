package ecommerce;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private Endereco endereco;
    private String email;
    private String cpf;
    private FormaPagamento formaPagamento;
    private ArrayList<Pedido> pedidos;

    // Sobrecarga de construtores
    public Cliente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.pedidos = new ArrayList<>();
    }

    public Cliente(String nome, Endereco endereco, String email, String cpf) {
        this(nome, email, cpf);
        this.endereco = endereco;
    }

    public void registrarEndereco(Endereco endereco) {
        this.endereco = endereco;
        System.out.println("Endereco registrado para " + nome + ": " + endereco);
    }

    public void registrarFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
        System.out.println("Forma de pagamento registrada: " + formaPagamento.getNome());
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void listarPedidos() {
        System.out.println("Pedidos do cliente " + nome + ":");
        for (Pedido pedido : pedidos) {
            System.out.println("- Pedido #" + pedido.getId() + " | Total pago: R$ " + String.format("%.2f", pedido.calcularTotalFinal()));
        }
    }

    public String getDocumento() {
        return cpf;
    }

    public String getTipoCliente() {
        return "Pessoa Fisica";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    @Override
    public String toString() {
        return getTipoCliente() + " {nome='" + nome + "', documento='" + getDocumento() + "', email='" + email + "'}";
    }
}
