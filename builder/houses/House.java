package builder.houses;

import builder.components.HouseType;
import builder.components.Roof;

public class House {

    private HouseType houseType;
    private Roof roof;
    private String color;

    public House(HouseType houseType, Roof roof, String color) {
        this.houseType = houseType;
        this.roof = roof;
        this.color = color;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseType=" + houseType +
                ", roof=" + roof +
                ", color='" + color + '\'' +
                '}';
    }
}
