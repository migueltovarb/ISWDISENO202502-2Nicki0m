package figura;

public class Circulo extends FiguraGeométrica {
	
	public Circulo(int valor1) {
		super(valor1);
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(valor1, 2);
	}
	
	 @Override
	    public double getPerimetro() {
	        return (2 * valor1) * Math.PI;
	 }
}
