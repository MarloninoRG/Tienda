/**
 * Clase Libro que hereda de Producto<Integer>
 */
public class Libro extends Producto<Integer> {

    /**
     * Constructor de la clase Libro
     * @param nombre Nombre del libro
     * @param precio Precio del libro
     * @param paginas Número de páginas
     */
    public Libro(String nombre, double precio, Integer paginas) {
        super(nombre, precio, paginas);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Libro: " + getNombre() + 
                           " | Precio: $" + getPrecio() + 
                           " | Páginas: " + getExtra());
    }
}
