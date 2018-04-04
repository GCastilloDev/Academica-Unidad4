package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto016 {
    /*
    Dado un grupo de números naturales positivos, calcule e imprima el cubo de
    estos números.
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el cubo de un grupo de números ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa cuántos números se va a calcular: ");
        int cantidad = n.nextInt();
        
        for (int i = 1; i <= cantidad; i++){
            System.out.print("Ingrese el número del que desea saber su resultado al cubo: ");
            float numero = n.nextFloat();
            System.out.println(numero + "^3 es: " + Math.pow(numero, 3));
        }
    }
}
