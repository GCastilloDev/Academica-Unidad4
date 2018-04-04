package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto017 {
    /*
    Obtener la tabla de multiplicar de un entero K comenzando desde el 1. 
    */
    
    public static void imprimirTabla(int num){
        
        for (int i = 1; i <= num; i++){
            System.out.println(num + " * " + i + " \t= " + (num * i));
        }
    }
    public static void main(String[] args) {
        System.out.println("*** Programa que obtiene la tabla de multiplicar "
                + "dado un número cualquiera ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingrese el número del cual desea saber su tabla de "
                + "multiplicar: ");
        int num = n.nextInt();
        
        System.out.println("************ TABLA DE MULTIPLICAR DEL NÚMERO " + num + 
                " ************\n");
        
        imprimirTabla(num);
    }
}
