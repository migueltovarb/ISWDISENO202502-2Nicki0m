package ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		Shape shape1 = new Shape("azul", true );
		System.out.println(shape1);
		
		Circle circle1 = new Circle(30, "verde", false);
		System.out.println(circle1);
		
		Rectangle rectangle1 = new Rectangle(15, 50);
		System.out.println(rectangle1);
		
		Square square1 = new Square(50, "café", true);
		System.out.println(square1);
		
		System.out.println("Area circulo " + circle1.getArea());
		System.out.println("Perimetro circulo " + circle1.getPerimeter());
		
		System.out.println("Area rectangulo " + rectangle1.getArea());
		System.out.println("Perimetro rectangulo " + rectangle1.getPerimeter());
		
		System.out.println("Area cuadrado " + square1.getArea());
		System.out.println("Perimetro cuadrado " +square1.getPerimeter());
	}

}
