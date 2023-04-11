//patron que consiste en crear objetos mediante prototipos clonandolos en lugar de crearlos desde 0

package prototype;

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    //metodo abstracto
    public abstract void draw();

    @Override
    public Object clone (){

        Object clone = null;

        try{
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
