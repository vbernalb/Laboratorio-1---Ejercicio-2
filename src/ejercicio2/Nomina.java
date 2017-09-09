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
public class Nomina {
    
    private ArrayList <Empleado> empleados = new ArrayList();

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(String nombre, String dia, String hl, String hs) {
        for (int i = 0; i < empleados.size(); i++) {
            if(empleados.get(i).getNombre().equals(nombre)){
            this.empleados.get(i).adddiario(dia,hl,hs);
            }
        }
    }
    
    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public void mostrarE (){
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Documento: " + empleado.getCC());
            System.out.println("Turno: " + empleado.getTurno());
        }           
    }
    
    public void mostrarUE (String nombre){
        for (Empleado empleado : empleados) {
            if(empleado.getNombre().equals(nombre))
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Documento: " + empleado.getCC());
            System.out.println("Turno: " + empleado.getTurno());
            System.out.println("Informacion diaria");
            empleado.mostrard();
        }           
    }
    
    
    
    
}