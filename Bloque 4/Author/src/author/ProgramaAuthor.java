package author;

public class ProgramaAuthor {

	public static void main(String[] args) {

		Author author1 = new Author("Mario", "mario@gmail.com", 'm');
		Author author2 = new Author("Carlos Diaz", "carlos@gmail.com", 'm');

        System.out.println("Name: " + author1.getName());
        System.out.println("Email: " + author1.getEmail());
        System.out.println("Gender: " + author1.getGender());

        // Probar setEmail
        author1.setEmail("mendoza.mario@correo.com");
        System.out.println("\nEmail actualizado: " + author1.getEmail());

        // Probar toString
        System.out.println("\nAutores:");
        System.out.println(author1);
        System.out.println(author2);
		
	}

}
