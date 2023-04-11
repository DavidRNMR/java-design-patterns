package prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape (String shapeId){

        Shape shapeCache = shapeMap.get(shapeId);
        return (Shape) shapeCache.clone();
    }
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }

}