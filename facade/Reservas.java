package facade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservas {
        private List<Reserva> reservas;

        public Reservas() {
            reservas = new ArrayList<>();
        }

        public void agregarReserva(Reserva reserva) {
            reservas.add(reserva);
        }

        public void eliminarReserva(Reserva reserva) {
            reservas.remove(reserva);
        }

        public Habitacion buscarHabitacion(Hotel hotel, String tipoHabitacion, LocalDate fechaInicio, LocalDate fechaFin) throws HabitacionNoDisponibleException {
            for (Habitacion habitacion : hotel.getHabitaciones()) {
                if (habitacion.getTipo().equals(tipoHabitacion) && habitacion.isDisponible(fechaInicio, fechaFin)) {
                    return habitacion;
                }
            }
            throw new HabitacionNoDisponibleException("No hay habitaciones disponibles en esas fechas");
        }

    @Override
    public String toString() {
        return "Reservas{" +
                "reservas=" + reservas +
                '}';
    }
}
