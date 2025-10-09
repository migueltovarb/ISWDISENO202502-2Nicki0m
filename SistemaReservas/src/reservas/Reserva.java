package reservas;

import java.util.List;

public class Reserva {
    private Estudiante estudiante;
    private Sala salaReservada;
    private long fecha;

    public Reserva(Estudiante estudiante, Sala salaReservada, long fecha, List<Reserva> historial) {
        
        if (estudiante == null) {
            throw new IllegalArgumentException("El estudiante no puede ser nulo.");
        }
        if (salaReservada == null) {
            throw new IllegalArgumentException("La sala no puede ser nula.");
        }
        if (fecha <= 0) {
            throw new IllegalArgumentException("La fecha debe ser válida (mayor que 0).");
        }

        // Validación: la sala debe estar disponible
        
        if (!salaReservada.isDisponibilidad()) {
            throw new IllegalArgumentException("La sala no está disponible actualmente.");
        }

        // Validaciones basadas en el historial
        if (historial != null) {
            for (Reserva r : historial) {
                // 1️⃣ No permitir reservar una sala ya ocupada en la misma fecha
                if (r.getSalaReservada().getNumSala() == salaReservada.getNumSala()
                        && r.getFecha() == fecha) {
                    throw new IllegalArgumentException("La sala ya está reservada en esa fecha y hora.");
                }

                // 2️⃣ No permitir duplicar una reserva igual
                if (r.getSalaReservada().getNumSala() == salaReservada.getNumSala()
                        && r.getEstudiante().equals(estudiante)
                        && r.getFecha() == fecha) {
                    throw new IllegalArgumentException("El estudiante ya tiene una reserva igual (misma sala, fecha y hora).");
                }
            }
        }

        this.estudiante = estudiante;
        this.salaReservada = salaReservada;
        this.fecha = fecha;
        
        this.salaReservada.setDisponibilidad(false);
    }

    // Getters y setters
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Sala getSalaReservada() {
        return salaReservada;
    }

    public void setSalaReservada(Sala salaReservada) {
        this.salaReservada = salaReservada;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Reserva [estudiante=" + estudiante + ", salaReservada=" + salaReservada.getNumSala() + ", fecha=" + fecha + "]";
    }
}

