package ejercicio2;

public class Main {
    public static void main(String[] args) {

        Staff staff1 = new Staff("Laura", "B La Rosa", "CCP", 12000);
        System.out.println(staff1);

        Student student1 = new Student("Francisco", "Chapal", "Derecho", 17, 130);
        System.out.println(student1);

        staff1.setPay(3000);
        System.out.println("Nuevo salario: " + staff1.getPay());

        student1.setYear(3);
        System.out.println("Nuevo año del estudiante: " + student1.getYear());
    }
}