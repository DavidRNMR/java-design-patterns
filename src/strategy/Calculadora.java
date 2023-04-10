package strategy;

public class Calculadora {

    private Operacion operacion;

    public Operacion getOperacion() {
        return operacion;
    }
    public int realizarOperacion(int num1, int num2) {
        return operacion.calcular(num1, num2);
    }
    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }
}
