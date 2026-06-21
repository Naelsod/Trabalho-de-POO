package ecommerce;

import java.util.ArrayList;

public class AtendenteVirtual {
    private String nome;
    private ArrayList<Cliente> clientesAtendidos;

    public AtendenteVirtual(String nome) {
        this.nome = nome;
        this.clientesAtendidos = new ArrayList<>();
    }

    public void atenderCliente(Cliente cliente, String mensagem) {
        clientesAtendidos.add(cliente);
        System.out.println("\nAtendente Virtual " + nome + " atendendo " + cliente.getNome());
        System.out.println("Mensagem do cliente: " + mensagem);
        System.out.println("Resposta: Ola! Vou verificar seu pedido e te ajudar.");
    }

    public void listarClientesAtendidos() {
        System.out.println("\nClientes atendidos por " + nome + ":");
        for (Cliente cliente : clientesAtendidos) {
            System.out.println("- " + cliente.getNome());
        }
    }
}
