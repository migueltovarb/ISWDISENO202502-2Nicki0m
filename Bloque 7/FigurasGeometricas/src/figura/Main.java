package figura;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      FiguraGeométrica[] figuras = {
	              new Circulo(5),         
	              new Cuadrado(4),        
	              new Rectangulo(3, 6),   
	              new Triangulo(5, 8),    
	              new Cubo(10)           
	          };

	          for (FiguraGeométrica fg : figuras) {
	              System.out.println("Figura: " + fg.getClass().getSimpleName());
	              System.out.println("Área: " + fg.getArea());

	            
	              if (!(fg instanceof Cubo)) {
	                  System.out.println("Perímetro: " + fg.getPerimetro());
	              }

	              System.out.println("---------------------");
	          }
	}

}
