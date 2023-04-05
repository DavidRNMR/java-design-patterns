package facade;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String nombre;
    private String ciudad;
    private List<Habitacion> habitaciones;

    public Hotel(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion (Habitacion habitacion){
        habitaciones.add(habitacion);
    }
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", habitaciones=" + habitaciones +
                '}';
    }
}
