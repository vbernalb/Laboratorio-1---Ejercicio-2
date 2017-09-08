/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.*;
/**
 *
 * @author familia
 */
public class Inventario {
    
    private ArrayList <Producto> lista = new ArrayList();
    private double vendido;
     
    public void setVendido() {
        this.vendido = 0.0;
    }
    
    public double getVendido() {
        return vendido;
    }

    public Inventario() {
        this.vendido = 0.0;
    }
    
    public void agregarP (Producto producto){
        lista.add(producto);
    }
    
    public void quitarP (String nombre){
        for (Producto prod : lista) {
            if(prod.getNombre().equalsIgnoreCase(nombre)){
                lista.remove(prod);
            }
        }
    }
    
    public boolean venta (String nombre, int cant){
        for (Producto prod : lista) {
            if(prod.getNombre().equalsIgnoreCase(nombre) && prod.getCantidad()>=cant){
                int a = prod.getCantidad();
                a = a-cant;
                prod.setCantidad(a); // QUITA DEL INVENTARIO LA CANTIDAD QUE SE COMPRA
                System.out.println("Compra exitosa");
                if(prod.getCantidad()==0){
                    System.out.println("Realizar pedido de " + prod.getNombre()); // SI SE ACABA EL PRODUCTO
                }

                this.vendido += cant*prod.getPrecio(); // PARA CUANTO HA VENDIDO LA TIENDA
                int b = prod.getVentas(); // PARA LISTA DE MAS VENDIDOS
                b += cant;
                prod.setVentas(b);
                return true;
            }
        }
        System.out.println("No hay el producto o la cantidad que desea");
        return false;
    }
     
    public void mostrarP (){
        for (Producto producto : lista) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("En existencia: " + producto.getCantidad());
            System.out.println("Precio: " + producto.getPrecio());
        }
    }
    
    public  ArrayList<String> MasVend(){
        ArrayList <String> n = new ArrayList();
        for (int j=0; j<lista.size(); j++) {
            boolean ac = true;
            for (int i = 0; i < lista.size(); i++) {
               ac &= lista.get(j).getVentas()>= lista.get(i).getVentas();    
               }
            if(ac){
                String a = lista.get(j).getNombre();
                n.add(a);
            }
            ac = true;
        }
        return n;
    }
 
    public  ArrayList<String> MenosVend(){
        ArrayList <String> n = new ArrayList();
        for (int j=0; j<lista.size(); j++) {
            boolean ac = true;
            for (int i = 0; i < lista.size(); i++) {
               ac &= lista.get(j).getVentas()<= lista.get(i).getVentas();    
               }
            if(ac){
                String a = lista.get(j).getNombre();
                n.add(a);
            }
            ac = true;
        }
        return n;
    }
        
    public void MasVendi(){
        Map<Integer, String> x = new TreeMap();
            for (Producto prod : lista) {
            x.put(prod.getVentas(),prod.getNombre());
        }
            Iterator it = x.keySet().iterator();
            while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + x.get(key));
            
        }
    }
    
    public void MVendidos(){
        ArrayList<String> a = MasVend();
        for (String Mv : a) {
            System.out.println(Mv);
        }
    }
    
    public void MeVendidos(){
        ArrayList<String> a = MenosVend();
        for (String Mv : a) {
            System.out.println(Mv);
        }
    }

    
    
    
    
    
    
    
    
}