package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Ejemplo009 {
    
    /*public static int obtenerFibonacci(int posicion){
          if(posicion == 0 || posicion==1)
               return posicion;
          else
               return obtenerFibonacci(posicion-1) + obtenerFibonacci(posicion-2);
    }*/
    
    public static void obtenerFibonacci(int posicion){
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        
        for (int i = 1; i <= (posicion-2);i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        
    }
    public static void main(String[] args) {
 
          Scanner n = new Scanner(System.in);
          System.out.print("Introduce el número de elementos a mostrar de la serie: ");
          int limite = n.nextInt();
          
          obtenerFibonacci(limite);
          /*for(int i = 0; i<=limite; i++){
              
               System.out.print(obtenerFibonacci(i) + ", ");
          }*/
     }     
}
