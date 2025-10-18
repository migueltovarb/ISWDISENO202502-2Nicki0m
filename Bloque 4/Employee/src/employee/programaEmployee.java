package employee;

public class programaEmployee {
    public static void main(String[] args) {
        
        // Crear un objeto de tipo employee
        employee emp1 = new employee(1, "Juan", "Perez", 2000);
        
        // Mostrar información básica
        System.out.println("ID: " + emp1.getId());
        System.out.println("Nombre completo: " + emp1.getFirstName() + " " + emp1.getLastName());
        System.out.println("Salario mensual: " + emp1.getSalary());
        
        // Probar métodos
        System.out.println("Salario anual: " + emp1.getAnnualSalary());
        
        emp1.raiseSalary(10);
        System.out.println("Nuevo salario tras aumento: " + emp1.getSalary());
       
        System.out.println(emp1.toString());
    }
}
