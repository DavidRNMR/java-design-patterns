package facade;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Habitacion {

    String tipo;
    private boolean disponible;
    private Map<LocalDate,LocalDate> reservas;

    public Habitacion (String tipo){
        this.tipo = tipo;
        disponible= true;
        reservas = new HashMap<>();
    }

    public boolean isDisponible(LocalDate fechaInicio, LocalDate fechaFin) {
        if (!disponible) {
            return false;
        }
        for (Map.Entry<LocalDate, LocalDate> reserva : reservas.entrySet()) {
            LocalDate reservaInicio = reserva.getKey();
            LocalDate reservaFin = reserva.getValue();
            if (fechaInicio.isBefore(reservaFin) && reservaInicio.isBefore(fechaFin)) {
                return false;
            }
        }
        return true;
    }

    public void reservar (LocalDate fechaInicio, LocalDate fechaFin){
        reservas.put(fechaInicio,fechaFin);
        disponible= false;
    }

    public void cancelar (LocalDate fechaInicio, LocalDate fechaFin) throws HabitacionNoDisponibleException{
        boolean encontrado = false;

        for (Map.Entry<LocalDate,LocalDate> reserva : reservas.entrySet()){
            LocalDate reservaInicio = reserva.getKey();
            LocalDate reservaFin = reserva.getValue();

            if(fechaInicio.equals(reservaInicio) && fechaFin.equals(fechaFin)){

                reservas.remove(reservaInicio);
                reservas.remove(reservaFin);
                encontrado = true;

                break;
            }
        }
        if(!encontrado){
            throw new HabitacionNoDisponibleException("habitacion ya esta reservada");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Map<LocalDate, LocalDate> getReservas() {
        return reservas;
    }

    public void setReservas(Map<LocalDate, LocalDate> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "tipo='" + tipo + '\'' +
                ", disponible=" + disponible +
                ", reservas=" + reservas +
                '}';
    }
}
