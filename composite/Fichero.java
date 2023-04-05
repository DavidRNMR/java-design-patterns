package composite;

//representa un fichero individual (hojas)
public class Fichero implements FileSystemItem {

    private String name;

    public Fichero (String name){
        this.name  = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void imprimir() {
        System.out.println("Fichero " + getName());
    }
}
