package figura;

public class Cuadrado extends FiguraGeométrica {

	public Cuadrado(int valor1) {
		super(valor1);
	}

	public double getArea() {
		return valor1*valor1;
	}
	
	public double getPerimetro() {
		return 4*valor1;
	}
}
