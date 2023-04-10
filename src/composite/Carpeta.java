package composite;

import java.util.ArrayList;
import java.util.List;

//representa una o un grupo de carpetas (compuestos)
public class Carpeta implements FileSystemItem{

    private String name;
    private List<FileSystemItem> items;

    public Carpeta (String name){
        this.name = name;
        items = new ArrayList<>();
    }

    @Override
    public void imprimir() {
        System.out.println("Carpeta " + getName());

        for(FileSystemItem item: items){
            item.imprimir();
        }
    }
    @Override
    public String getName() {
        return name;
    }

    public void add (FileSystemItem item){
        items.add(item);
    }

    public void remove (FileSystemItem item){
        items.remove(item);
    }

    public FileSystemItem getChild (int index){
        return items.get(index);
    }


}
