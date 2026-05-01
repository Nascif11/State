package Padrao.State;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void deveIniciarEmPreparo() {
        Pedido pedido = new Pedido();

        assertEquals("Em preparo", pedido.getNomeEstado());
    }

    @Test
    void deveAvancarParaSaiuParaEntrega() {
        Pedido pedido = new Pedido();

        pedido.avancar();

        assertEquals("Saiu para entrega", pedido.getNomeEstado());
    }

    @Test
    void deveAvancarAteEntregue() {
        Pedido pedido = new Pedido();
        pedido.avancar();
        pedido.avancar();
        assertEquals("Entregue", pedido.getNomeEstado());
    }

    @Test
    void deveCancelarPedido() {
        Pedido pedido = new Pedido();

        pedido.cancelar();

        assertEquals("Cancelado", pedido.getNomeEstado());
    }

    @Test
    void naoDeveAvancarDepoisDeEntregue() {
        Pedido pedido = new Pedido();

        pedido.avancar();
        pedido.avancar();
        pedido.avancar();

        assertEquals("Entregue", pedido.getNomeEstado());
    }

    @Test
    void naoDeveCancelarDepoisDeEntregue() {
        Pedido pedido = new Pedido();

        pedido.avancar();
        pedido.avancar();
        pedido.cancelar();

        assertEquals("Entregue", pedido.getNomeEstado());
    }
}