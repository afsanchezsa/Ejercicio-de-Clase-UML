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
    private ArrayList<String> nombresvendedores=new ArrayList<String>();
    private ArrayList<String> nombresvendedores2=new ArrayList<String>();
    private ArrayList<Integer>enteros=new ArrayList<Integer>();
   
   int mayor;
   String bestseller;
    public Tienda() {
        this.factura = new ArrayList<Factura>();
        
    }
    public void contar(){
    for(int i=0;i<factura.size();i++){
    enteros.add(i,factura.get(i).getVendedor().ventas);
    }
    int major=mayor(enteros);
        System.out.println("quien mas ventas tuvo fue: "+factura.get(major).getVendedor().getNombre());
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
    public/* ArrayList<String>*/void todoslosnombres(){
    for(int i=0;i<this.factura.size();i++){
    facturatemporal=this.factura.get(i);
    nombresvendedores.set(i, this.facturatemporal.getVendedor().getNombre());
    }
    //return nombresvendedores;
    
    }
   public/* ArrayList<String>*/void funcion_auxiliar(){
       for(int i=0;i<nombresvendedores.size();i++){
       if(!nombresvendedores.get(i).equalsIgnoreCase(null)){
           String nombreactual=nombresvendedores.get(i);
       nombresvendedores2.add(nombresvendedores.get(i));
       for(int j=i+1;j<nombresvendedores.size();j++){
       if(nombresvendedores.get(j).equalsIgnoreCase(nombreactual)){
       nombresvendedores.set(j, null);
               
               
       
       
               
       }
       }
       }
       }
       //return nombresvendedores2;
       
       
   }
   
   public int numerodeveces(String nombre, ArrayList<String> arreglo){
   
       int contador=0;
       for(int i=0;i<arreglo.size();i++){
       if(arreglo.get(i).equalsIgnoreCase(nombre)){
       contador++;
       }
       }
       return contador;
   }
   public /*ArrayList<Integer>*/void arreglonumeroventas(){
       
   //nombresvendedores2=funcion_auxiliar();
   //nombresvendedores=todoslosnombres();
   for(int i=0;i<nombresvendedores2.size();i++){
   enteros.add((numerodeveces(nombresvendedores2.get(i), nombresvendedores)));
       }
   //return enteros;
   }
   public int mayor(ArrayList<Integer>enteros){
   
       for(int i=1;i<enteros.size();i++){
   if(enteros.get(i)>enteros.get(i-1)){
   mayor=i;
   }
   }
   return mayor;
   }
   public String mejorempleado(){
   return nombresvendedores2.get(mayor(enteros));
   }
   public void funcionfinal(){
  /* nombresvendedores=*/todoslosnombres();
   /*nombresvendedores2=*/funcion_auxiliar();
   /*enteros=*/arreglonumeroventas();
   bestseller=mejorempleado();
   //return bestseller;
   }

    public String getBestseller() {
        return bestseller;
    }
    public void impresion(){
    for(int i=0;i<nombresvendedores.size();i++){
        System.out.println(nombresvendedores.get(i));
    }
    }
   
}
