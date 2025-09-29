/**
 * Clase Electronico que hereda de Producto<String>
 */
public class Electronico extends Producto<String> {

    /**
     * Constructor de la clase Electronico
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param garantia Tiempo de garantía
     */
    public Electronico(String nombre, double precio, String garantia) {
        super(nombre, precio, garantia);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Electrónico: " + getNombre() + 
                           " | Precio: $" + getPrecio() + 
                           " | Garantía: " + getExtra());
    }
}
