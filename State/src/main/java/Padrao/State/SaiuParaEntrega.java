package Padrao.State;

public class SaiuParaEntrega implements EstadoPedido {

    public String getNomeEstado() {
        return "Saiu para entrega";
    }

    public void avancar(Pedido pedido) {
        pedido.setEstado(new Entregue());
    }

    public void cancelar(Pedido pedido) {
        pedido.setEstado(new Cancelado());
    }
}