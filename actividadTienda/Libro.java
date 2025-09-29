/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.actividadTienda;

/**
 *
 * @author Marlon Rojas Galindo
 */
public class Libro extends Producto{
    private Integer numPaginas;
    
    public Libro(Integer numPaginas, String nombre, float precio, Object informacion) {
        super(nombre, precio, informacion);
        this.numPaginas = numPaginas;
    }

    public Libro() {
    }
    
    public Libro(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Paginas: " + this.getNumPaginas());
    }
}
