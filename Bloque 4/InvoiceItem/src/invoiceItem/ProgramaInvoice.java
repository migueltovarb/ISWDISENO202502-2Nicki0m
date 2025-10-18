package invoiceItem;

public class ProgramaInvoice {
    public static void main(String[] args) {
        
        // Crear un objeto de tipo InvoiceItem
        InvoiceItem item1 = new InvoiceItem("A101", "Laptop Lenovo", 2, 15000.50);
        
        // Probar los getters
        System.out.println("ID: " + item1.getID());
        System.out.println("Descripción: " + item1.getDesc());
        System.out.println("Cantidad: " + item1.getQty());
        System.out.println("Precio unitario: " + item1.getUnitPrice());
        
        // Probar getTotal()
        System.out.println("Total: " + item1.getTotal());
        
        // Cambiar cantidad y precio
        item1.setQty(3);
        item1.setUnitPrice(14000.75);
        System.out.println("\nDespués de modificar cantidad y precio:");
        System.out.println("Cantidad: " + item1.getQty());
        System.out.println("Precio unitario: " + item1.getUnitPrice());
        System.out.println("Nuevo total: " + item1.getTotal());
        
        System.out.println(item1.toString());
    }
} 
