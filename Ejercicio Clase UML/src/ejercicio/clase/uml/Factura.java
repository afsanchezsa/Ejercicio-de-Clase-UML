/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.clase.uml;

/**
 *
 * @author Estudiante
 */
public class Factura {
    private int formadepago;
    private int codigopromocional;
    private double preciofinal;
    private Detalle[]detalle;

    public Factura(int formadepago, int codigopromocional, double preciofinal, Detalle[] detalle) {
        this.formadepago = formadepago;
        this.codigopromocional = codigopromocional;
        this.preciofinal = preciofinal;
        this.detalle = new Detalle();
    }
    
    public void imprimir(){
    
    }
    public void obtenertotal(){
    for(int i=0;i<10;i++){    
    preciofinal+=this.detalle[i].obtenersubtotal();
    }
    }
}
