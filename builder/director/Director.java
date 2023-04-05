package builder.director;

import builder.Builder;
import builder.components.HouseType;
import builder.components.Roof;

public class Director {

    //tres productos
    public void buildPareado (Builder builder){
        builder.setHouseType(HouseType.PAREADO);
        builder.setRoof(new Roof("Ladrillo",150F));
        builder.setColor("roja");
    }
    public void buildAdosado (Builder builder){
        builder.setHouseType(HouseType.ADOSADO);
        builder.setRoof(new Roof("Pizarra",500F));
        builder.setColor("azul");
    }

    public void buildIndividual (Builder builder){
        builder.setHouseType(HouseType.INDIVIDUAL);
        builder.setRoof(new Roof("Teja",150F));
        builder.setColor("amarillo");
    }

}
