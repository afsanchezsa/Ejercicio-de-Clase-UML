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
    private Fecha fecha;
    private Vendedor vendedor;
    private int indice=0;

    public Factura(int formadepago, int codigopromocional, double preciofinal, Detalle[] detalle, Vendedor vendedor, int dia,int mes,int ano,int hora) {
        this.formadepago = formadepago;
        this.codigopromocional = codigopromocional;
        this.preciofinal = preciofinal;
        this.detalle = new Detalle[10];
        this.vendedor=vendedor;
        this.fecha=new Fecha(dia, mes, ano, hora);
    }
    
    public void imprimir(){
       double subtotalfinal=0;
        System.out.print("Forma de pago: ");
        if(this.formadepago==0){
            System.out.print(" Efectivo");
            
        }else if(this.formadepago==1){
            System.out.print("Débito");
        }else if(this.formadepago==2){
            System.out.print("Tarjeta");
        }
        System.out.println("Fecha: \n Dia:"+this.fecha.getDia()+"Mes: "+this.fecha.getMes()+"Año: "+this.fecha.getAno()+"Hora: "
        + this.fecha.getHora()+":00");
        System.out.println("codigo promocional"+this.codigopromocional);
        System.out.println("detalles:\n Producto    \t cantidad   \t subtotal ");
                for(int i=0;i<10;i++){
                    System.out.println(this.detalle[i].getProducto()+" "+ this.detalle[i].getCantidadvendida()+" "+this.detalle[i].obtenersubtotal());
                subtotalfinal+=this.detalle[i].obtenersubtotal();
                }
        subtotalfinal=subtotalfinal*codigopromocional;
        System.out.println(" subtotal final con descuento: "+subtotalfinal);
        
                
        
    }
    public double obtenertotal(){
    for(int i=0;i<10;i++){    
    preciofinal+=this.detalle[i].obtenersubtotal();
    
    }
    return preciofinal;
    }
    public void mostrardatosventa(Vendedor vendedor){
    if(this.vendedor==vendedor){
         double subtotalfinal=0;
        System.out.print("Forma de pago: ");
        if(this.formadepago==0){
            System.out.print(" Efectivo");
            
        }else if(this.formadepago==1){
            System.out.print("Débito");
        }else if(this.formadepago==2){
            System.out.print("Tarjeta");
        }
        System.out.println("Fecha: \n Dia:"+this.fecha.getDia()+"Mes: "+this.fecha.getMes()+"Año: "+this.fecha.getAno()+"Hora: "
        + this.fecha.getHora()+":00");
        System.out.println("codigo promocional"+this.codigopromocional);
        System.out.println("detalles:\n Producto    \t cantidad   \t subtotal ");
                for(int i=0;i<10;i++){
                    System.out.println(this.detalle[i].getProducto()+" "+ this.detalle[i].getCantidadvendida()+" "+this.detalle[i].obtenersubtotal());
                subtotalfinal+=this.detalle[i].obtenersubtotal();
                }
        subtotalfinal=subtotalfinal*codigopromocional;
        System.out.println(" subtotal final con descuento: "+subtotalfinal);
        
                
    }
    
    }

    public void setDetalle(int cantidadvendida,Producto producto) {
        this.detalle[indice] = new Detalle(cantidadvendida, producto);
        indice++;
    }
}
