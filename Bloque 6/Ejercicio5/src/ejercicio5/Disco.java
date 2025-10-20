package ejercicio5;

public class Disco extends Publicacion {

	private float duracion;

	public Disco() {
		super();
	}

	public Disco(float duracion) {
		super();
		this.duracion = duracion;
	}

	public Disco(String titulo, int precio, float duracion) {
		super(titulo, precio);
		this.duracion = duracion;
		
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Disco [" + super.toString() + "duracion=" + duracion + "]";
	}
	
	
	
	
}
