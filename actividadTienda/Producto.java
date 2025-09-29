/**
 * Clase abstracta Producto
 * @param <T> Tipo Genérico para información extra
 */
public abstract class Producto<T> {
    private String nombre;   // nombre del producto
    private double precio;   // precio del producto
    private T extra;         // información adicional de tipo genérico

    /**
     * Constructor
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param extra  Información Extra
     */
    public Producto(String nombre, double precio, T extra) {
        this.nombre = nombre;
        this.precio = precio;
        this.extra = extra;
    }

    // Métodos de acceso
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public T getExtra() { return extra; }

    // Método abstracto que cada subclase debe implementar
    public abstract void mostrarDetalles();
}
