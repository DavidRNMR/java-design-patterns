package builder;

import builder.components.HouseType;
import builder.components.Roof;

public interface Builder {

    void setHouseType (HouseType houseType);
    void setRoof (Roof roof);
    void setColor (String color);
}
