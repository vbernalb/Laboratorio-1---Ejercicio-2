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
public class Dia {
        private String dia;
        private String HLLegada;
        private String HSalida;

    public Dia(String dia, String HLLegada, String HSalida) {
        this.dia = dia;
        this.HLLegada = HLLegada;
        this.HSalida = HSalida;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHLLegada() {
        return HLLegada;
    }

    public void setHLLegada(String HLLegada) {
        this.HLLegada = HLLegada;
    }

    public String getHSalida() {
        return HSalida;
    }

    public void setHSalida(String HSalida) {
        this.HSalida = HSalida;
    }
        
        
}
