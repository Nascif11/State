package Padrao.State;

public class Cancelado implements EstadoPedido {

    public String getNomeEstado() {
        return "Cancelado";
    }
    public void avancar(Pedido pedido) {

    }

    public void cancelar(Pedido pedido) {
    }
}