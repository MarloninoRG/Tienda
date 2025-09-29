public class MainProductos {
    public static void main(String[] args) {
        // Creamos un arreglo para almacenar productos
        Producto<?>[] inventario = new Producto<?>[4];

        inventario[0] = new Libro("Java Básico", 299.99, 350);
        inventario[1] = new Electronico("Laptop ASUS", 15999.99, "2 años");
        inventario[2] = new Libro("Patrones de Diseño", 499.50, 420);
        inventario[3] = new Electronico("Smartphone Samsung", 10999.00, "1 año");

        // Recorremos el arreglo y mostramos detalles
        for (Producto<?> p : inventario) {
            p.mostrarDetalles();
        }
    }
}
