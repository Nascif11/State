package Padrao.State;

public interface EstadoPedido {

    String getNomeEstado();

    void avancar(Pedido pedido);

    void cancelar(Pedido pedido);
}