/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.actividadTienda;
/**
 *
 * @author Marlon Rojas Galindo
 */
public class MainProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto<?> [] productos = new Producto<?>[4];
        
        productos [0] = new Libro(256, "Java Basico", 299, productos);
    }
    
}
