package figura;

public class Cubo extends Cuadrado{
	
	public Cubo(int valor1) {
		super(valor1);
	}

	public double getArea() {
		return (valor1*valor1)*6;
	}
}
