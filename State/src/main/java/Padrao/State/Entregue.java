package Padrao.State;

public class Entregue implements EstadoPedido {

    public String getNomeEstado() {
        return "Entregue";
    }

    public void avancar(Pedido pedido) {

    }

    public void cancelar(Pedido pedido) {

    }
}