package reservas;

public class Sala {

	private int numSala;
	private int capacidadMax;
	private boolean disponibilidad;
	
	
	public Sala() {
		super();
	}

	public Sala(int numSala, int capacidadMax, boolean disponibilidad) {
		super();
		this.numSala = numSala;
		this.capacidadMax = capacidadMax;
		this.disponibilidad = disponibilidad;
	}

	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	public void registrarSala () {
		this.registrarSala();
	}
	
	
}
