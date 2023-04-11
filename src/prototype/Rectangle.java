package prototype;

public class Rectangle extends Shape{

    public Rectangle (){
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("dibujando con un rectangulo");
    }
}
