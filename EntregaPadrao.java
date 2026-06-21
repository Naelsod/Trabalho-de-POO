package ecommerce;

public class EntregaPadrao implements Entrega {
    @Override
    public String getTipo() {
        return "Entrega padrao";
    }

    @Override
    public double calcularFrete() {
        return 15.00;
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getId() + " sera entregue em ate 7 dias uteis.");
    }
}
