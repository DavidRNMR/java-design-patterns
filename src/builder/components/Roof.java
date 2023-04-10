package builder.components;

public class Roof {

    private String material;
    private Float surface;

    public Roof(String material, Float surface) {
        this.material = material;
        this.surface = surface;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Float getSurface() {
        return surface;
    }

    public void setSurface(Float surface) {
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "material='" + material + '\'' +
                ", surface=" + surface +
                '}';
    }
}
