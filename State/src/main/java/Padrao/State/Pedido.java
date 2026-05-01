package Padrao.State;

public class Pedido {

    private EstadoPedido estado;

    public Pedido() {
        this.estado = new Preparo();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public String getNomeEstado() {
        return estado.getNomeEstado();
    }

    public void avancar() {
        estado.avancar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }
}