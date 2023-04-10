package strategy;

public class Multiplicacion implements Operacion{
    @Override
    public int calcular(int num1, int num2) {
        return num1 * num2;
    }
}
