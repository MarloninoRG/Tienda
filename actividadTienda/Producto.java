/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.actividadTienda;

/**
 *
 * @author Marlon Rojas Galindo
 */
public abstract class Producto<T> {
    //Atributos
    private String nombre;
    private float precio;
    private T informacion;

    public Producto() {
    }

    public Producto(String nombre, float precio, T informacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.informacion = informacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public T getInformacion() {
        return informacion;
    }

    public void setInformacion(T informacion) {
        this.informacion = informacion;
    }
    
    public abstract void mostrarDetalles();
}
