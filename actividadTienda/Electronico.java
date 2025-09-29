/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.actividadTienda;

/**
 *
 * @author Marlon Rojas Galindo
 */
public class Electronico extends Producto {
    private String garantia;

    public Electronico(String garantia, String nombre, float precio, Object informacion) {
        super(nombre, precio, informacion);
        this.garantia = garantia;
    }

    public Electronico() {
    }

    public Electronico(String garantia) {
        this.garantia = garantia;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Garantia: " + this.getGarantia());
    }
    
}
