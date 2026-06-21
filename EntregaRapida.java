package ecommerce;

public class EntregaRapida implements Entrega {
    @Override
    public String getTipo() {
        return "Entrega rapida";
    }

    @Override
    public double calcularFrete() {
        return 30.00;
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getId() + " sera entregue em ate 2 dias uteis.");
    }
}
