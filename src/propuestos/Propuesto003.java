package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto003 {
    /*
    Determinar, de N cantidades, cuántas son cero, cuántas son menores a cero,
    y cuántas son mayores a cero. 
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que determina cuantos números son cero, "
                + "cuantos son negativos y cuantos son positivos ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("¿Cuántos números ingresará? ");
        int cantidad = n.nextInt();
        
        int positivos = 0;
        int negativos = 0;
        int cero = 0;
        
        for (int i = 1; i <= cantidad; i++){
            System.out.print("Ingresa el número ["+i+"]: ");
            float num = n.nextFloat();
            if(num > 0) positivos++;
            else if (num < 0) negativos++;
            else cero++;
        }
        
        System.out.println("\nEn la serie de números proporcionados hay:");
        System.out.println(positivos + " números mayores a cero.");
        System.out.println(negativos + " números menores a cero.");
        System.out.println(cero + " números igual a cero.");
    }
}
