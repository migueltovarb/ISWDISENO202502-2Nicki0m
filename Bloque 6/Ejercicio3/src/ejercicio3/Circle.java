package ejercicio3;
import java.lang.Math;

public class Circle extends Shape {

	private double radios = 1;

	public Circle() {
		super();
	}

	public Circle(double radios) {
		super();
		this.radios = radios;
	}

	public Circle(double radios, String color, boolean filled) {
		super(color, filled);
		this.radios = radios;
	}

	public double getRadios() {
		return radios;
	}

	public void setRadios(double radios) {
		this.radios = radios;
	}
	
	public double getArea() {
		return  Math.PI*Math.pow(radios, 2);
		}
	
	public double getPerimeter() {
		return (radios*2)*Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [" + super.toString() + "radios=" + radios + "]";
	}
	
	
}
