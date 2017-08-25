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
public class GestionTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tienda mitienda=new Tienda();
        Vendedor mivendedor=new Vendedor("Andres", "Sanchez");
        Producto miproducto=new Producto("Computadores", 123450);
        Factura factura=new Factura(0, 0.95, mivendedor, 12,8, 2017, 4);
        factura.agregarDetalle(3, miproducto);
        factura.agregarDetalle(3, miproducto);
        factura.agregarDetalle(3, miproducto);
        factura.agregarDetalle(3, miproducto);
        factura.agregarDetalle(3, miproducto);
        factura.agregarDetalle(3, miproducto);
        
        mitienda.agregarFactura(factura);
        factura.mostrardatosventa(mivendedor);
        
    
    }
    
}
