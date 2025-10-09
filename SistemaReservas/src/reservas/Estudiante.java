package reservas;

import java.util.List;

public class Estudiante {

	private String nombre;
	private int codigo;
	private Programa programa;
	private List<Reserva> historial;
	
	
	public Estudiante() {
		super();
	}
	
	public Estudiante(String nombre, int codigo, Programa programa) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.programa = programa;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Programa getPrograma() {
		return programa;
	}
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	
	public List<Reserva> getHistorial() {
		return historial;
	}

	public void setHistorial(List<Reserva> historial) {
		this.historial = historial;
	}

	public void registrarEstudiante() {
		this.registrarEstudiante();
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", codigo=" + codigo + ", programa=" + programa + "]";
	}
	
	
}
