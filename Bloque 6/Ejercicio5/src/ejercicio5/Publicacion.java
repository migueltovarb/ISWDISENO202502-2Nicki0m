package ejercicio5;

public class Publicacion {

	private String titulo;
	private int precio;
	
	public Publicacion() {
		super();
	}

	public Publicacion(String titulo, int precio) {
		super();
		this.titulo = titulo;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Publicacion [titulo=" + titulo + ", precio=" + precio + "]";
	}
	
	
}
