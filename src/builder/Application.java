package builder;

import builder.builders.HouseBuilder;
import builder.director.Director;
import builder.houses.House;

public class Application {

    public static void main(String[] args) {

        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilder();

        //java sabe a que constructor llamar
        director.buildAdosado(houseBuilder);

        House house = houseBuilder.getResult();
        System.out.println("casa construida de tipo " + house.getHouseType());

        //el director puede construir de diferentes maneras

        director.buildIndividual(houseBuilder);
        House house1 = houseBuilder.getResult();
        System.out.println("casa construida " +house1.toString());
    }
}
