package Padrao.State;

public class Preparo implements EstadoPedido {

    public String getNomeEstado() {
        return "Em preparo";
    }

    public void avancar(Pedido pedido) {
        pedido.setEstado(new SaiuParaEntrega());
    }

    public void cancelar(Pedido pedido) {
        pedido.setEstado(new Cancelado());
    }
}
