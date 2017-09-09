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
public class Producto {
    
    private String Nombre;
    private double PrecioVenta;
    private int Cantidad;
    private int ventas;
    private double preciob;

    public Producto(double Precio, int Cantidad, String Nombre, double preciob) {
        this.PrecioVenta = Precio;
        this.Cantidad = Cantidad;
        this.Nombre = Nombre;
        this.ventas = 0;
        this.preciob = preciob;
    }

    public double getPreciob() {
        return preciob;
    }

    public void setPreciob(double preciob) {
        this.preciob = preciob;
    }

    
    public double getPrecio() {
        return PrecioVenta;
    }

    public void setPrecio(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    
    
}
