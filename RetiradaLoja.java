package ecommerce;

public class RetiradaLoja implements Entrega {
    @Override
    public String getTipo() {
        return "Retirada na loja";
    }

    @Override
    public double calcularFrete() {
        return 0.00;
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getId() + " ficara disponivel para retirada na loja.");
    }
}
