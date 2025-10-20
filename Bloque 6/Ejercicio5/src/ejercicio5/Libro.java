package ejercicio5;

public class Libro extends Publicacion {

	private int numPaginas;
	private int anioPublicacion;
	
	
	public Libro() {
		super();
	}

	public Libro(int numPaginas, int añoPublicacion) {
		super();
		this.numPaginas = numPaginas;
		this.anioPublicacion = añoPublicacion;
	}

	public Libro(String titulo, int precio, int numPaginas, int añoPublicacion) {
		super(titulo, precio);
		this.numPaginas = numPaginas;
		this.anioPublicacion = añoPublicacion;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public int getAñoPublicacion() {
		return anioPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.anioPublicacion = añoPublicacion;
	}

	@Override
	public String toString() {
		return "Libro [" + super.toString() + "numPaginas=" + numPaginas + ", anioPublicacion=" + anioPublicacion + "]";
	}
	
	
	
}
