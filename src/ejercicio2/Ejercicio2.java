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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Inventario inv = new Inventario();
        
        Scanner In = new Scanner (System.in);
        
        int a = 0;
        while (a!=7){
            System.out.println(
            "\n" +
            "\n" +
            "¿Que desea hacer?\n" + 
            "1. Agregar productos al inventario\n" +
            "2. Realizar una venta\n" +
            "3. Ver productos mas vendidos\n" +
            "4. Ver productos menos vendidos\n" +
            "5. Ver todos los productos\n" +
            "6. Dinero de ventas\n" +
            "7. Salir\n" +
            "\n" 
            );
            a = In.nextInt();
            switch (a){
                case 1:
                    int z = 0;
                    do{
                    System.out.println("Ingrese el nombre del producto");
                    String j = In.next();
                    System.out.println("Ingrese el valor");
                    double b = In.nextDouble();
                    System.out.println("Ingrese la cantidad");
                    int c = In.nextInt();

                    Producto producto = new Producto(b,c,j);
                    inv.agregarP(producto);
                    System.out.println("Digite 1 si quiere seguir ingresando productos");
                    z = In.nextInt();
                    }
                    while(z==1);
                    break;
                case 2:
                    System.out.println( "Usted eligio realizar una venta" );
                    System.out.println("Ingrese el nombre del producto" );
                    String Name = In.next();
                    System.out.println( "Ingrese la cantidad que va a comprar" );
                    int cant = In.nextInt();
                    
                    inv.venta(Name, cant);
                    break;
                case 3:
                    System.out.println("Usted eligio productos mas vendidos" );
                    inv.MVendidos();
                    break;
                case 4:
                    System.out.println("Usted eligio productos menos vendidos" ); 
                    inv.MeVendidos();
                    break;
                case 5:
                    System.out.println("Lista de todos los productos" );
                    inv.mostrarP();
                    break;
                case 6:
                    System.out.println("Dinero recaudado de ventas" );
                    inv.getVendido();
                    break;
                case 7:
                    System.out.println("Gracias por utilizar el programa. Adios\n" );
                    break;
                default:
                    System.out.println("Opcion no implementada, intente de nuevo\n" );
                    break;
                    
            }
            
            
        }
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        

