package facade;

import java.time.LocalDate;
import java.util.List;

public class ReservasFacade {
    private Hoteles hoteles;
    private Reservas reservas;

    public ReservasFacade() {
        hoteles = new Hoteles();
        reservas = new Reservas();
    }

    public Hoteles getHoteles() {
        return hoteles;
    }

    public void setHoteles(Hoteles hoteles) {
        this.hoteles = hoteles;
    }

    public Reservas getReservas() {
        return reservas;
    }

    public void setReservas(Reservas reservas) {
        this.reservas = reservas;
    }

    public List<Hotel> buscarHoteles(String nombre, String ciudad) {
        return hoteles.buscarHoteles(nombre, ciudad);
    }


    public Reserva reservarHabitacion(Hotel hotel, String tipoHabitacion, LocalDate fechaInicio, LocalDate fechaFin) throws HabitacionNoDisponibleException {
        Habitacion habitacion = reservas.buscarHabitacion(hotel, tipoHabitacion, fechaInicio, fechaFin);
        Reserva reserva = new Reserva(habitacion, fechaInicio, fechaFin);
        reservas.agregarReserva(reserva);
        habitacion.reservar(fechaInicio, fechaFin);
        return reserva;
    }
    public void cancelarReserva(Reserva reserva) throws HabitacionNoDisponibleException {
        Habitacion habitacion = reserva.getHabitacion();
        habitacion.cancelar(reserva.getFechaInicio(), reserva.getFechaFin());
        reservas.eliminarReserva(reserva);
    }
}
