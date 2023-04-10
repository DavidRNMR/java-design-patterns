package state;

public class Cancelado implements EstadoPedido{
    @Override
    public void confirmar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("el pedido ya se confirmó");
    }

    @Override
    public void cancelar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("el pedido ya se cancelo");
    }

    @Override
    public void enviar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("el pedido ya se cancelo");
    }

    @Override
    public void entregar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("el pedido ya se cancelo");
    }
}
