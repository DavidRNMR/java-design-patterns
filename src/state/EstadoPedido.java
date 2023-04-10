package state;

public interface EstadoPedido {

    void confirmar(Pedido pedido) throws IllegalAccessException;
    void cancelar(Pedido pedido) throws IllegalAccessException;
    void enviar(Pedido pedido) throws IllegalAccessException;
    void entregar(Pedido pedido) throws IllegalAccessException;
}
