package composite;

public class Application {

    public static void main(String[] args) {

        //ficheros

        Fichero fichero1 = new Fichero("fichero1.txt");
        Fichero fichero2 = new Fichero("fichero2.txt");
        Fichero fichero3 = new Fichero("fichero3.txt");

        //subcarpetas y agregar ficheros

        Carpeta subcarpeta1 = new Carpeta("subcarpeta1");
        subcarpeta1.add(fichero1);
        subcarpeta1.add(fichero2);

        Carpeta subcarpeta2 = new Carpeta("subcarpeta2");
        subcarpeta2.add(fichero3);

        //carpetas principales

        Carpeta carpeta = new Carpeta("carpeta");

        carpeta.add(subcarpeta1);
        carpeta.add(subcarpeta2);

        carpeta.imprimir();


    }
}
