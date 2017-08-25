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
        this.detalle = new Detalle[10];
    }
    
    public void imprimir(){
        System.out.print("Forma de pago: ");
        if(this.formadepago==0){
            System.out.print(" Efectivo");
            
        }else if(this.formadepago==1){
            System.out.print("Débito");
        }else if(this.formadepago==2){
            System.out.print("Tarjeta");
        }
        System.out.println("codigo promocional"+this.codigopromocional);
        System.out.println("detalles:\n ");
                for(int i=0;i<10;i++){
                
                }
        
    }
    public void obtenertotal(){
    for(int i=0;i<10;i++){    
    preciofinal+=this.detalle[i].obtenersubtotal();
    }
    }
}
