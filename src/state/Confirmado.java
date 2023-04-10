package state;

public class Confirmado implements EstadoPedido{
    @Override
    public void confirmar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("el pedido ya se confirmo");
    }

    @Override
    public void cancelar(Pedido pedido) throws IllegalAccessException {
        pedido.setEstado(new Cancelado());
    }

    @Override
    public void enviar(Pedido pedido) throws IllegalAccessException {
        pedido.setEstado(new Enviado());
    }

    @Override
    public void entregar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("el pedido debe ser enviado antes");
    }
}
