package ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Datos para libro
        System.out.println("Ingrese título del libro:");
        String tituloLibro = sc.nextLine();

        System.out.println("Ingrese precio del libro:");
        int precioLibro = sc.nextInt();

        System.out.println("Ingrese número de páginas:");
        int paginas = sc.nextInt();

        System.out.println("Ingrese año de publicación:");
        int anio = sc.nextInt();

        Libro libro1 = new Libro(tituloLibro, precioLibro, paginas, anio);

        // Datos para disco
        sc.nextLine(); 
        System.out.println("Ingrese título del disco:");
        String tituloDisco = sc.nextLine();

        System.out.println("Ingrese precio del disco:");
        int precioDisco = sc.nextInt();

        System.out.println("Ingrese duración (minutos):");
        float duracion = sc.nextFloat();

        Disco disco1 = new Disco(tituloDisco, precioDisco, duracion);

        // Mostrar resultados
        System.out.println("\n--- Publicaciones Registradas ---");
        System.out.println(libro1);
        System.out.println(disco1);

        sc.close();
    }
}
