package state;

public class Application {

    public static void main(String[] args) throws IllegalAccessException {

        Pedido pedido = new Pedido();

        //pedido nuevo
        pedido.confirmar();
        pedido.cancelar();

        //estados disponibles: enviar, confirmar, cancelar
        pedido.confirmar();
        pedido.enviar();
        pedido.cancelar();

        //pedido enviado: podemos cancelar o entregar
        pedido.entregar();
        pedido.cancelar();

        //si el pedido está entregado, no podemos hacer nada

    }
}
