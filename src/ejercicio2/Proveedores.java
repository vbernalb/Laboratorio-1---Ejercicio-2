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
public class Proveedores {
    ArrayList <Prov> proveedores;

    public Proveedores(ArrayList<Prov> proveedores) {
        this.proveedores = proveedores;
    }
    
    public void addDeuda (String nombre, double deuda, String fechaP){ //AGREGAR DEUDA A UN PROVEEDOR
        for (Prov proveedor : proveedores) {
            if(proveedor.getNombre().equals(nombre)){
                double x = proveedor.getDebe();
                x += deuda;
                proveedor.setDebe(x);
                proveedor.setFechaP(fechaP);
                System.out.println("Deuda total al proveedor " + proveedor.getNombre() + " = " + proveedor.getDebe());
                break;
            }
        } 
    }
    
    public void Mprov(){ //MOSTRAR INFO TODOS LOS PROVEEDORES
        for (Prov proveedore : proveedores) {
            System.out.println("Nombre: " + proveedore.getNombre());
            System.out.println("Deuda: " + proveedore.getDebe());
            System.out.println("Fecha limite de pago: " + proveedore.getFechaP() + "\n");
        }
    }
    
    public void MUprov(String nombre){ //MOSTRAR INFO UN PROVEEDOR
        for (Prov proveedore : proveedores) {
            if(proveedore.getNombre().equals(nombre)){
                System.out.println("Nombre: " + proveedore.getNombre());
                System.out.println("Deuda: " + proveedore.getDebe() + "\n");
                System.out.println("Fecha limite de pago: " + proveedore.getFechaP() + "\n");
                break;
            }
        }
    }
    
    public void Pdeuda(String nombre){ //PAGAR DEUDA
        for (Prov proveedore : proveedores) {
            if(proveedore.getNombre().equals(nombre)){
                proveedore.setDebe(0.0);
                break;
            }
            
        }
    }
    
    public void quitarProv (String nombre){
        for (Prov proveedore : proveedores) {
            if(proveedore.getNombre().equals(nombre)){
                proveedores.remove(proveedore);
                break;
            }
        }
        System.out.println("Proveedor eliminado");
    }
}
