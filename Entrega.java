package ecommerce;

public interface Entrega {
    String getTipo();
    double calcularFrete();
    void entregar(Pedido pedido);
}
