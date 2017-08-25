/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.clase.uml;

import java.util.ArrayList;

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
        Vendedor mivendedor2=new Vendedor("Sergio", "Sanchez");
        Producto miproducto=new Producto("Computadores", 123450);
        Factura factura=new Factura(0, 0.95, mivendedor, 12,8, 2017, 4);
        factura.agregarDetalle(3, miproducto);
        factura.agregarDetalle(3, miproducto);
        factura.agregarDetalle(3, miproducto);
        factura.agregarDetalle(3, miproducto);
        factura.agregarDetalle(3, miproducto);
        factura.agregarDetalle(3, miproducto);
 Factura factura2=new Factura(0, 0.95, mivendedor2, 12,8, 2017, 4);
 Factura factura3=new Factura(0, 0.95, mivendedor2, 12,8, 2017, 4);
 Factura factura4=new Factura(0, 0.95, mivendedor2, 12,8, 2017, 4);
 Factura factura5=new Factura(0, 0.95, mivendedor2, 12,8, 2017, 4);
 factura2.agregarDetalle(3, miproducto);       
 /*ArrayList<String> nombresvendedores=new ArrayList<String>();
                nombresvendedores=mitienda.todoslosnombres();
        ArrayList<String> nombresvendedores2=new ArrayList<String>();
                nombresvendedores2=mitienda.funcion_auxiliar();
                ArrayList<Integer>enteros=new ArrayList<Integer>();
                enteros=mitienda.arreglonumeroventas();*/
                
        
        
        mitienda.agregarFactura(factura);
        mitienda.agregarFactura(factura2);
        mitienda.agregarFactura(factura3);
        mitienda.agregarFactura(factura4);
        mitienda.agregarFactura(factura5);
        factura.mostrardatosventa(mivendedor);
       // String bestseller=mitienda.mejorempleado();
       mitienda.contar();     
        mitienda.impresion();
    }
    
}
