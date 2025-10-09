package reservas;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    public static void main(String[] args) {

        // Crear estudiante
        Estudiante estudiante = new Estudiante("Juliet", 1234, Programa.SOFTWARE);

        // Crear salas
        Sala sala1 = new Sala(1, 30, true);
        Sala sala2 = new Sala(2, 45, true);
        Sala sala3 = new Sala(9, 25, true);

        // Crear historial de reservas
        List<Reserva> historial = new ArrayList<>();

        try {
            // Crear reservas con validación
            Reserva reserva1 = new Reserva(estudiante, sala1, 25100819, historial);
            historial.add(reserva1);

            Reserva reserva2 = new Reserva(estudiante, sala2, 25100917, historial);
            historial.add(reserva2);
            
            Reserva reserva3 = new Reserva(estudiante, sala2, 25100917, historial);
            historial.add(reserva3);


        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error al crear la reserva: " + e.getMessage());
        }

        int contadorReservas = 0;
        for (Reserva reserva : historial) {
            contadorReservas++;
            System.out.println("Reserva #" + contadorReservas + ": " + reserva);
        }

        System.out.println("\nTotal de reservas: " + contadorReservas);
        System.out.println("Estudiante: " + estudiante);
    }
}
