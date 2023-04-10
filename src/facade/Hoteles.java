package facade;

import java.util.ArrayList;
import java.util.List;

public class Hoteles {

    private List<Hotel> hoteles;

    public Hoteles() {
        hoteles = new ArrayList<>();
    }

    public void agregarHotel(Hotel hotel) {
        hoteles.add(hotel);
    }

    public List<Hotel> buscarHoteles(String nombre, String ciudad) {
        List<Hotel> resultados = new ArrayList<>();
        for (Hotel hotel : hoteles) {
            if (hotel.getNombre().equals(nombre) && hotel.getCiudad().equals(ciudad)) {
                resultados.add(hotel);
            }
        }
        return resultados;
    }

    public List<Hotel> getHoteles() {
        return hoteles;
    }

    public void setHoteles(List<Hotel> hoteles) {
        this.hoteles = hoteles;
    }

    @Override
    public String toString() {
        return "Hoteles{" +
                "hoteles=" + hoteles +
                '}';
    }
}
