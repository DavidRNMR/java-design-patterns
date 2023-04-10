package state;

public class Entregado implements EstadoPedido{
    @Override
    public void confirmar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("el pedido ya se entregó");
    }

    @Override
    public void cancelar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("el pedido ya se entregó");
    }

    @Override
    public void enviar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("el pedido ya se entregó");
    }

    @Override
    public void entregar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("el pedido ya se entregó");
    }
}
