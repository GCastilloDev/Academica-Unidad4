package propuestos;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Propuesto011 {
    /*
    Obtener una función exponencial, la cual está dada por:
    e^x = 1 + (x^1/1!) + (x^2/2!) + ....
    */
    
    public static double obtenerFactorial(int n){
        if (n==0)
                return 1;
        else
            return n*(obtenerFactorial(n-1));
    }
    
    public static void main(String[] args) {
        
        System.out.println("*** Programa que calcula una aproximación del "
                + "número aureo \"e\" dada \"x\" ****");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingresa el valor de \"x\": ");
        int valorX = n.nextInt();
        
        double valorDivision = 0;
        double funcionE = 0;
        
        for (int i = 1; i <= valorX; i++){            
            valorDivision = 1 / obtenerFactorial(i);
            funcionE+=valorDivision;
        }      
                
        funcionE = funcionE + 1;
        System.out.println("El valor de \"e\" a la " + valorX +" es: " + funcionE);
    }
}
