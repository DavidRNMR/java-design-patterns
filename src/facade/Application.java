package facade;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) throws HabitacionNoDisponibleException{

        Habitacion habitacion = new Habitacion("deluxe");
        Habitacion habitacion1 = new Habitacion("doble");
        List<Habitacion> habitaciones = Arrays.asList(habitacion,habitacion1);

        Hotel hotel = new Hotel("Barcelo", "Madrid");
        hotel.setHabitaciones(habitaciones);

        List<Hotel> hoteles = Arrays.asList(hotel);

        Hoteles hotels = new Hoteles();
        hotels.setHoteles(hoteles);

        Reserva reserva = new Reserva(habitacion, LocalDate.of(2023,5,23),LocalDate.of(
                2023,10,10));


        Reservas reservas = new Reservas();
        reservas.agregarReserva(reserva);

        ReservasFacade reservasFacade = new ReservasFacade();
        reservasFacade.setHoteles(hotels);


        //cancelamos la reserva y hace saltar la excepcion de habitacion no encontrada
        //reservasFacade.cancelarReserva(reserva);



        System.out.println(reservasFacade.buscarHoteles("Barcelo","Madrid"));
        System.out.println(reservas.buscarHabitacion(hotel,"deluxe",LocalDate.now(),LocalDate.of(2023,5,10)).toString());




    }
}
