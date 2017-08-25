/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.clase.uml;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Tienda {
    private ArrayList<Factura>factura;
    private double totalventas=0;
    private  Factura facturatemporal;

    public Tienda() {
        this.factura = new ArrayList<Factura>();
    }

    public void agregarFactura(Factura factura) {
        this.factura.add(factura);
    }
    
    
    
    public double gettotalventas(){
    for(int i=0;i<this.factura.size();i++){
    facturatemporal=this.factura.get(i);
        totalventas+=facturatemporal.obtenertotal();
    } System.out.println("el total de las ventas es: ");
        return totalventas;
    }
    
    
}
