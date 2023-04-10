package singleton;

public class Application {

    public static void main(String[] args) {

        Gobierno gobierno = Gobierno.getGobierno("España");
        Gobierno gobierno1 = Gobierno.getGobierno("Francia");
    }
}
