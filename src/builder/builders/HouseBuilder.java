package builder.builders;

import builder.Builder;
import builder.houses.House;
import builder.components.HouseType;
import builder.components.Roof;

public class HouseBuilder implements Builder {

   private HouseType houseType;
   private Roof roof;
   private String color;

    @Override
    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    @Override
    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public void setColor(String color) {
    this.color = color;
    }

    public House getResult(){
        return  new House(houseType,roof,color);
    }
}
