//*

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
        Nomina nomina = new Nomina();

        
        Scanner In = new Scanner (System.in);
        

        int b = 0;
 
        while(b!=4){
            System.out.println(
            "\n" +
            "\n" +
            "¿A Que menu desea acceder?\n" + 
            "1. Inventario\n" +
            "2. Nomina\n" +
            "3. Proveedores\n" +
            "4. Salir\n" +
            "\n" 
            );
            b = In.nextInt();
            
            switch (b){
            
            
                case 1:
                int a = 0;
                while (a!=10){
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
                    "7. Ganancias\n" +
                    "8. Compras realizadas\n" +
                    "9. Eliminar producto del inventario\n" +
                    "10. Salir\n" +
                    "\n" 
                    );
                    a = In.nextInt();
                    switch (a){
                        case 1:
                            int z = 0;
                            do{
                            In.skip("\n");
                            System.out.println("Ingrese el nombre del producto");
                            String j = In.nextLine();
                            System.out.println("Ingrese el valor real");
                            double d = In.nextDouble();
                            System.out.println("Ingrese el valor al publico");
                            double v = In.nextDouble();
                            System.out.println("Ingrese la cantidad");
                            int cc = In.nextInt();
                            System.out.println("Ingrese 1 si el proveedor ya esta registrado en el sistema, otro numero en caso de que no lo este");
                            int nn = In.nextInt();
                            In.skip("\n");
                            System.out.println("Ingrese el nombre proveedor");
                            String hg = In.nextLine();
                            System.out.println("Ingrese fecha limite de pago (dd/mm/aaaa)");
                            String hm = In.next();

                                   
                            Producto producto = new Producto(v,cc,j,d);
                            inv.agregarP(producto,hg,hm,nn);
                            System.out.println("Digite 1 si quiere seguir ingresando productos");
                            z = In.nextInt();
                            }
                            while(z==1);
                            break;
                        case 2:
                            System.out.println( "Usted eligio realizar una venta" );
                            In.skip("\n");
                            System.out.println("Ingrese el nombre del producto" );
                            String Name = In.nextLine();
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
                            System.out.println(inv.getVendido());
                            break;
                        case 7:
                            System.out.println("Ganancias" );
                            System.out.println(inv.getGanancias());
                            break;
                        case 8:
                            System.out.println("Compras relizadas" );
                            System.out.println(inv.getComprado());
                            break;
                        case 9:
                            System.out.println("Usted eligio elimnar producto del inventario" );
                            In.skip("\n");
                            System.out.println("Ingrese el nombre del producto" );
                            String gg = In.nextLine();
                            inv.quitarP(gg);
                            break;
                        case 10:
                            System.out.println("Gracias por utilizar el programa. Adios\n" );
                            break;
                        default:
                            System.out.println("Opcion no implementada, intente de nuevo\n" );
                            break;
                       
                        }                            //FIN PRIMER CASO
                    }
                break;
                
                case 2:
                int c = 0;
                while (c!=6){
                    System.out.println(
                    "\n" +
                    "\n" +
                    "¿Que desea hacer?\n" + 
                    "1. Agregar empleado\n" +
                    "2. Agregar Informacion diaria empleado\n" +
                    "3. Ver informacion todos los empleados\n" +
                    "4. Ver informacion de un empleado\n" +
                    "5. Eliminar un empleado\n" +
                    "6. Salir\n" +
                    "\n" 
                    );
                    c = In.nextInt();
                    switch (c){
                        case 1:
                            int zz = 0;
                            do{
                            In.skip("\n");
                            System.out.println("Ingrese el nombre del empleado");
                            String j = In.nextLine();
                            System.out.println("Ingrese el documento de identificacion");
                            int d = In.nextInt();
                            System.out.println("Ingrese el turno (1 o 2)");
                            int v = In.nextInt();

                            Empleado emp = new Empleado(j,d,v);
                            nomina.addEmpleado(emp);
                            System.out.println("Digite 1 si quiere seguir ingresando empleados");
                            zz = In.nextInt();
                            }
                            while(zz==1);
                            break;
                        case 2:
                            System.out.println( "Usted eligio agregar informacion diaria empleado" );
                            In.skip("\n");
                            System.out.println( "Ingrese el nombre del empleado" );
                            String nombre = In.nextLine();
                            System.out.println("Ingrese el dia (dd/mm/aaaa)" );
                            String dia = In.next();
                            System.out.println( "Ingrese la hora de llegada (hh:mm)" );
                            String hl = In.next();
                            System.out.println( "Ingrese la hora de salida (hh:mm)" );
                            String hs = In.next();
                            
                            Dia dia1 = new Dia(dia,hl,hs);
                            nomina.setEmpleados(nombre, dia1);
                            
                            break;
                        case 3:
                            System.out.println("Usted eligio ver informacion de todos los empleados" );
                            nomina.mostrarE();
                            break;
                        case 4:
                            System.out.println("Usted eligio ver la informacion un empleado" ); 
                            In.skip("\n");
                            System.out.println("Ingrese el nombre" ); 
                            String aa = In.nextLine();
                            nomina.mostrarUE(aa);
                            break;
                        case 5:
                            System.out.println("Usted eligio eliminar un empleado\n" );
                            In.skip("\n");
                            System.out.println("Ingrese el nombre del empleado\n" );
                            String xx = In.nextLine();
                            nomina.quitarE(xx);
                            break;
                        case 6:
                            System.out.println("Gracias por utilizar el programa. Adios\n" );
                            break;
                        default:
                            System.out.println("Opcion no implementada, intente de nuevo\n" );
                            break;
                       
                    }  
                
                }  
            break;
            
            case 3:
                c = 0;
                while (c!=7){
                    System.out.println(
                    "\n" +
                    "\n" +
                    "¿Que desea hacer?\n" + 
                    "1. Agregar deuda a proveedor\n" +
                    "2. Ver informacion todos los proveedores\n" +
                    "3. Ver informacion de un proveedor\n" +
                    "4. Eliminar un proveedor\n" +
                    "5. Pagar deuda\n" +
                    "6. Lista de productos agotados\n" +
                    "7. Salir\n" +
                    "\n" 
                    );
                    c = In.nextInt();
                    switch (c){
                        case 1:
                            In.skip("\n");
                            System.out.println("Ingrese el nombre del proveedor");
                            String j = In.nextLine();
                            System.out.println("Ingrese el valor de la deduda adquirida con dicho proveedor");
                            double d = In.nextDouble();
                            System.out.println("Ingrese la fecha limite de pago (dd/mm/aaaa)");
                            String v = In.next();
                            
                            inv.addDeuda(j, d, v);
                            
                            break;
                        case 2:
                            System.out.println("Usted eligio ver informacion de todos los proveedores" );
                            inv.Mprov();
                            break;
                        case 3:
                            System.out.println("Usted eligio ver la informacion un proveedor" ); 
                            In.skip("\n");
                            System.out.println("Ingrese el nombre del proveedor" ); 
                            String aa = In.nextLine();
                            inv.MUprov(aa);
                            break;
                        case 4:
                            System.out.println("Usted eligio eliminar un proveedor" );
                            In.skip("\n");
                            System.out.println("Ingrese el nombre del proveedor" );
                            String xx = In.nextLine();
                            inv.quitarProv(xx);
                            break;
                        
                        case 5:
                            System.out.println("Usted eligio pagar deuda" );
                            In.skip("\n");
                            System.out.println("Ingrese el nombre del proveedor\n" );
                            xx = In.nextLine();
                            inv.Pdeuda(xx);
                            break;
                        case 6:
                            System.out.println("Usted eligio productos por pedir\n" );
                            System.out.println("Lista de productos agotados");
                            inv.Pedir();
                            break;
                        case 7:
                            System.out.println("Gracias por utilizar el programa. Adios\n" );
                            break;
                        default:
                            System.out.println("Opcion no implementada, intente de nuevo\n" );
                            break;
                       
                    }  
                
                }  
            break;
        }
        
    }
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        

