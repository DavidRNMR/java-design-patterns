package state;

public class Nuevo implements EstadoPedido{
    @Override
    public void confirmar(Pedido pedido) {
        pedido.setEstado(new Confirmado());
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstado(new Cancelado());
    }

    @Override
    public void enviar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("no se puede enviar antes de ser confirmado");
    }

    @Override
    public void entregar(Pedido pedido) throws IllegalAccessException {
        throw new IllegalAccessException("no se puede entregar sin ser enviado");
    }
}
