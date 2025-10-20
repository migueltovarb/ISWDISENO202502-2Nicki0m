package figura;

public class Triangulo extends FiguraGeométrica {

	protected int valor2;

	public Triangulo(int valor1, int valor2) {
		super(valor1);
		this.valor2 = valor2;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	
	public double getArea() {
		return 0.5 * valor1 * valor2;
	}
	
	public double getPerimetro() {
		return valor1 + valor1+ valor2;
	}
	
	
}
