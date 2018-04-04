package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Ejemplo012 {
    /*
    Un empleado de la tienda “Tiki Taka” realiza N ventas durante el día,
    se requiere saber cuántas de ellas fueron mayores a $1000, cuántas fueron
    mayores a $500 pero menores o iguales a $1000, y cuántas fueron menores o 
    iguales a $500. Además, se requiere saber el monto de lo vendido en cada
    categoría y de forma global. 
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el número de ventas y el "
                + "total de ellas por categorías ***");
        
        Scanner n = new Scanner(System.in);
        
        char next = 's';
        int contadorCat1=0;
        int contadorCat2=0;
        int contadorCat3=0;
        int contadorT=0;
        float ventaCat1=0;
        float ventaCat2=0;
        float ventaCat3=0;
        float ventaT=0;
        
        while (next == 's'){
            System.out.print("\nIngrese el monto de la venta $");
            float monto = n.nextFloat();
            if (monto > 1000){
                contadorCat1++;
                ventaCat1+=monto;
            }
            else if (monto > 500){
                contadorCat2++;
                ventaCat2+=monto;
            }
            else{
                contadorCat3++;
                ventaCat3+=monto;
            }
            ventaT+=monto;
            contadorT++;
            System.out.print("¿Desea ingresar otra venta? ");
            next = Character.toLowerCase(n.next().charAt(0));
        }
        
              
        System.out.println("\t\t\t\t\t\t***Cantidad de ventas realizadas***");
        System.out.println("\nMayores a $1000.00 \tMayores a $500.00 y/o menores igual a $1000.000 \tMenores o igual a $500.00");
        System.out.println("\t"+contadorCat1 +"\t\t\t\t\t"+contadorCat2+"\t\t\t\t\t"+contadorCat3);
        System.out.println("Total de ventas realizadas: " + contadorT);
        
        System.out.println("\n\t\t\t\t\t\t***Monto de ventas realizadas***");
        System.out.println("\nMayores a $1000.00 \tMayores a $500.00 y/o menores igual a $1000.000 \tMenores o igual a $500.00");
        System.out.println("\t"+ventaCat1 +"\t\t\t\t\t"+ventaCat2+"\t\t\t\t\t"+ventaCat3);
        System.out.println("Monto de ventas realizadas: $" + ventaT);
    }
}
