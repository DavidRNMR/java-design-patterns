package singleton;

public class Gobierno {

    private static Gobierno gobierno;
    private String pais;

    private Gobierno (String pais){
        this.pais = pais;
    }

    public static Gobierno getGobierno (String pais){
        if (gobierno ==null){
            return new Gobierno(pais);
        }
        return gobierno;
    }
}
