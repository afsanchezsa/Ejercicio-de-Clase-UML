/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.clase.uml;

/**
 *
 * @author USUARIO
 */
public class Detalle {
private int cantidadvendida;
private Producto producto;

    public Detalle() {
    }
    public double obtenersubtotal(){
    double subtotal=this.cantidadvendida*producto.precio;
    }

    public int getCantidadvendida() {
        return cantidadvendida;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidadvendida(int cantidadvendida) {
        this.cantidadvendida = cantidadvendida;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
