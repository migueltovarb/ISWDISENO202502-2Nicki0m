package inventario;

import java.util.Scanner;

public class InventarioSupermercado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		final int MAX_PRODUCTOS = 5;
		String [] nombre = new String[MAX_PRODUCTOS];
		int [] cantidades = new int [MAX_PRODUCTOS];
		int total = 0;

		System.out.println("Bienvenido al inventario del Supermercado");
		
		for (int i= 0; i<MAX_PRODUCTOS; i++) {
			System.out.println("Ingrese el nombre del producto " + (i+1) + ":");
			nombre[i]= sc.nextLine();
			
			System.out.println("Ingrese la cantidad disponible de " + nombre[i] + ":" );
			while (!sc.hasNextInt()) {
                System.out.print("Entrada no válida. Ingrese un número entero: ");
                sc.next();
                }

			int cantidad = sc.nextInt();
			sc.nextLine();
			
			while (cantidad < 0) {
                System.out.print("La cantidad no puede ser negativa. Ingrese de nuevo: ");
                cantidad = sc.nextInt();
                sc.nextLine(); 
            }

			cantidades[i] = cantidad;
            total += cantidad;
            
	        }
		int opcion;
        do {
            System.out.println("\n--- MENÚ DE INVENTARIO ---");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Buscar producto");
            System.out.println("3. Actualizar inventario");
            System.out.println("4. Alertas de stock bajo (<10)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 
            
            switch (opcion) {
            
                case 1:
                    System.out.println("\n INVENTARIO");
                    for (int i = 0; i < MAX_PRODUCTOS; i++) {
                        System.out.println(nombre[i] + ": " + cantidades[i] + " unidades");
                    }
                    System.out.println("Total de productos en inventario: " + total);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String buscar = sc.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < MAX_PRODUCTOS; i++) {
                        if (nombre[i].equalsIgnoreCase(buscar)) {
                            System.out.println(nombre[i] + " → " + cantidades[i] + " unidades");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    String producto = sc.nextLine();
                    boolean existe = false;
                    for (int i = 0; i < MAX_PRODUCTOS; i++) {
                        if (nombre[i].equalsIgnoreCase(producto)) {
                            System.out.print("Ingrese cantidad a agregar (+) o quitar (-): ");
                            int cambio = sc.nextInt();
                            sc.nextLine(); 
                            if (cantidades[i] + cambio < 0) {
                                System.out.println("No se puede dejar en negativo.");
                            } else {
                                cantidades[i] += cambio;
                                total += cambio;
                                System.out.println("Inventario actualizado: " +
                                                   nombre[i] + " → " + cantidades[i] + " unidades");
                            }
                            existe = true;
                            break;
                        }
                    }
                    if (!existe) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n Productos con bajo stock:");
                    boolean hayBajoStock = false;
                    for (int i = 0; i < MAX_PRODUCTOS; i++) {
                        if (cantidades[i] < 10) {
                            System.out.println("- " + nombre[i] + " (" + cantidades[i] + " unidades)");
                            hayBajoStock = true;
                        }
                    }
                    if (!hayBajoStock) {
                        System.out.println("Todos los productos tienen stock suficiente.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema");
                    break;

                default:
                    System.out.println("Opción no encontrada.");
                    
                while (!sc.hasNextInt()) {
                        System.out.print("Entrada no válida. Ingrese un número entero: ");
                        sc.next();
                        }
            }
        } while (opcion != 5);

        sc.close();
    }

}	


