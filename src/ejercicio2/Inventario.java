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
    
    private ArrayList <Producto> lista;
    private double vendido;
    private double comprado;
    private double ganancias;
    private Proveedores prov;

    public Inventario() {
        this.lista = new ArrayList();
        this.vendido = 0.0;
        this.comprado = 0.0;
        this.ganancias = 0.0;
        this.prov = new Proveedores();
    }

    public double getComprado() {
        return comprado;
    }
    
    public double getGanancias() {
        return ganancias;
    }
        
    public double getVendido() {
        return vendido;
    }
    
    public void sumarProv(Producto producto, String proveedor, String fpago, int a){
        boolean am = true;
        double  m =0;
        if(a!=1){
            Prov prov1 = new Prov(proveedor,0,fpago);
            prov.getProveedores().add(prov1);
        }
        int t = prov.getProveedores().size();
        for (int i = 0; i < t ; i++) {
            if(prov.getProveedores().get(i).getNombre().equals(proveedor)&& prov.getProveedores().get(i)!=null){
               m = prov.getProveedores().get(i).getDebe();
               m += producto.getCantidad()*producto.getPrecio();
               prov.getProveedores().get(i).setDebe(m);
               am = false;
               break;
            }
        }
        if(am){
            m = producto.getCantidad()*producto.getPrecio();
        }
    };
    
    public void agregarP (Producto producto, String proveedor, String fpago, int a){
        boolean ac = true;
        boolean am = true;
        double  m =0;
        for (Producto prod : lista) {
            if(prod.getNombre().equals(producto.getNombre())){
                prod.setPrecio(producto.getPrecio());
                prod.setCantidad(producto.getCantidad());
                prod.setPreciob(producto.getPreciob());
                ac = false;
                sumarProv(producto, proveedor, fpago,a);
            }
        }
        if(ac){
        lista.add(producto);
            sumarProv(producto, proveedor, fpago,a);
        }
        int k = producto.getCantidad();
        double b = producto.getPreciob();
        this.comprado += k*b;
        this.ganancias -= k*b;
                
    }
    
    public void quitarP (String nombre){
        for (Producto prod : lista) {
            if(prod.getNombre().equals(nombre)){
                lista.remove(prod);
                break;
            }
        }
        System.out.println("Producto eliminado");
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
                this.ganancias += cant*prod.getPrecio();
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
    
    public ArrayList clonar (){
        ArrayList <Producto> n = new ArrayList();
        for (Producto prod: lista) {
            n.add(prod);
        }
        return n;
    } //PARA MasVend y MenosVend
    
    public  ArrayList<String> MasVend(){
        ArrayList <String> n = new ArrayList();
        ArrayList <Producto> m = clonar();
        boolean ac = true;
        int j=0;
        while(m.size()!=0){
            for (int i = 0; i < m.size(); i++) {
               ac &= m.get(j).getVentas()>= m.get(i).getVentas();    
               }
            if(ac){
                String a = m.get(j).getNombre();
                n.add(a);
                m.remove(j);
                j=0;
            }else{
                j++;
            }
            ac = true;
        }
        return n;
    }
 
    public  ArrayList<String> MenosVend(){
        ArrayList <String> n = new ArrayList();
        ArrayList <Producto> m = clonar();
        boolean ac = true;
        int j=0;
        while(m.size()!=0){
            for (int i = 0; i < m.size(); i++) {
               ac &= m.get(j).getVentas()<= m.get(i).getVentas();    
               }
            if(ac){
                String a = m.get(j).getNombre();
                n.add(a);
                m.remove(j);
                j=0;
            }else{
                j++;
            }
            ac = true;
        }
        return n;
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

    
  /*      
    public void MasVendi(){
        Map<Integer, String> x = new TreeMap();
            for (Producto prod : lista) {
            x.put(prod.getVentas(),prod.getNombre());
        }
                System.out.println(x.toString());     
    }

    
    public void MeVendi(){
        Map<Integer, String> x = new TreeMap();
            for (Producto prod : lista) {
            x.put(prod.getVentas(),prod.getNombre());
        }
                System.out.println(x.toString());
    }
*/


    
    
    
    
    
    
    
}