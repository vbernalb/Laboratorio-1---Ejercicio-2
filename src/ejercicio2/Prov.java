/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author familia
 */
public class Prov {
    private String Nombre;
    private double Debe;
    private String fechaP;

    public Prov(String Nombre, double Debe, String fechaP) {
        this.Nombre = Nombre;
        this.Debe = Debe;
        this.fechaP = fechaP;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getDebe() {
        return Debe;
    }

    public void setDebe(double Debe) {
        this.Debe = Debe;
    }
    
    
}
