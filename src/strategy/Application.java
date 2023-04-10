package strategy;

public class Application {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        //suma
        calculadora.setOperacion(new Suma());
        int resultado = calculadora.realizarOperacion(10,5);
        System.out.println(resultado);

        //resta
        calculadora.setOperacion(new Resta());
        resultado = calculadora.realizarOperacion(10,2);
        System.out.println(resultado);

        //multiplicacion
        calculadora.setOperacion(new Multiplicacion());
        resultado = calculadora.realizarOperacion(5,2);
        System.out.println(resultado);

        //division
        calculadora.setOperacion(new Division());
        resultado = calculadora.realizarOperacion(20,5);
        System.out.println(resultado);

    }
}
