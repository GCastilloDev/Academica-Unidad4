package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Ejemplo016 {
    /*
    La cadena de tiendas de autoservicio  “El mandilón” cuenta con sucursales en 
    C ciudades diferentes de la República, en cada ciudad cuenta con T tiendas y 
    cada tienda cuenta con N empleados, asimismo, cada una registra lo que vende 
    de manera individual cada empleado, cuánto fue lo que vendió cada tienda, 
    cuánto se vendió en cada ciudad y cuánto recaudó la cadena en un solo día.
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el total de ventas de una"
                + " cadena comercial ***");        
        float ventaT = 0;
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\n¿En cuántas ciudades tiene sucursales? ");
        int numCiudad = n.nextInt();
        
        for (int ciudad = 1; ciudad <= numCiudad; ciudad++){
            System.out.print("\n¿Cúantas sucursales tiene la ciudad ["+ciudad+"]? ");
            int numTienda = n.nextInt();            
            float ventaCiudad = 0;  
             
            
            for (int tienda = 1; tienda <= numTienda; tienda++){
                System.out.print("\n¿Cuántos empleados tiene la tienda ["+tienda+"] de la "
                        + "ciudad ["+ciudad+"]? ");
                int numEmpleado = n.nextInt();                
                float ventaTienda = 0;             
                System.out.println("");    
                
                for (int empleado = 1; empleado <= numEmpleado; empleado++){
                    System.out.print("Ingrese la venta diaria del empleado ["+empleado+"] "
                            + "de la tienda ["+tienda+"]: $");
                    float venta = n.nextFloat();                    
                    ventaTienda+=venta;
                }
                
                System.out.println("\nEl total de venta de la tienda ["+tienda+"] es de $" +
                        ventaTienda);                
                ventaCiudad+=ventaTienda;
            }
            System.out.println("\nEl total de venta de la ciudad ["+ciudad+"] es de $" +
                    ventaCiudad);
            ventaT+=ventaCiudad;
        }
        
        System.out.println("\nEl total de ventas de la cadena es de $" + ventaT);        
    }
}
