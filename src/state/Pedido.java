package state;

public class Pedido {

    private EstadoPedido estado;

    public Pedido(){
        estado = new Nuevo();
    }

    public void setEstado(EstadoPedido estado){
        this.estado = estado;
    }

    public void confirmar () throws IllegalAccessException {
        estado.confirmar(this);
    }

    public void cancelar() throws IllegalAccessException {
        estado.cancelar(this);
    }

    public void enviar () throws IllegalAccessException {
        estado.enviar(this);
    }

    public void entregar () throws IllegalAccessException {
        estado.entregar(this);
    }
}
