package state;

public class Enviado implements EstadoPedido{
    @Override
    public void confirmar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("el pedido ya se envio");
    }

    @Override
    public void cancelar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("el pedido ya se envio");
    }

    @Override
    public void enviar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("el pedido ya se envio");
    }

    @Override
    public void entregar(Pedido pedido) throws IllegalAccessException {
        pedido.setEstado(new Entregado());
    }
}
