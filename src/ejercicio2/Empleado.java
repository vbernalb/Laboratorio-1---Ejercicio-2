/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.Dia;

/**
 *
 * @author familia
 */
public class Empleado {
    
    private Dia[] dia;
    private String Nombre;
    private int CC;
    private int turno;
    private int ac;


    public Empleado(String Nombre, int CC, int turno) {
        this.Nombre = Nombre;
        this.CC = CC;
        this.turno = turno;
        this.dia = new Dia[31];
        this.ac = 0;
    }

    public Dia[] getDia() {
        return dia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    public void adddiario (String dia, String hl, String hs){
        Dia dia1 = new Dia(dia,hl,hs);
        this.dia[ac] = dia1;
        ac++;
    }
    
    public void mostrard (){
        for (int i = 0; i < 31; i++) {
            if(dia[i]!=null){
                System.out.println("Dia: " + dia[i].getDia());
                System.out.println("Hora Llegada: " + dia[i].getHLLegada());
                System.out.println("Hora Salida: " + dia[i].getHSalida());
            }
        }
    }
}
