package ejercicio4;

public class Main {

	public static void main(String[] args) {
		
		 	Animal a1 = new Animal("Frijolito");
	        System.out.println(a1);

	        Mammal m1 = new Mammal("Roberto");
	        System.out.println(m1);

	        Cat c1 = new Cat("Michi");
	        System.out.println(c1);
	        c1.greets();  

	        Dog d1 = new Dog("Muñeca");
	        Dog d2 = new Dog("Gugi");
	        System.out.println(d1);
	        
	        d1.greets();        
	        d1.greets(d2);      
		

	}

}
