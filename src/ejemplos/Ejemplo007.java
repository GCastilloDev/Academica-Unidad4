package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo007 {
    /*
    Determinar, de N cantidades, cuántas son menores o iguales a cero y
    cuántas mayores a cero. 
    */
    public static void imprimirPositivoNegativo(int cantidad){
        Scanner n = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        for(int i = 1; i <= cantidad; i++){
            System.out.print("Ingrese un número: ");
            float numero = n.nextFloat();
            if (numero >= 0) positivos+=1;
            else negativos+=1;
        }
        System.out.println("\nLa cantidad de positivos es " + positivos);
        System.out.println("La cantidad de negativos es " + negativos);
    }
    public static void main(String[] args) {
        System.out.println("*** Programa que cuenta cuantos números negativos "
                + "y cuantos positivos hay en una cantidad de \"n\" números ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\n¿Cuántos números ingresará? ");
        int cantidad = n.nextInt();
        imprimirPositivoNegativo(cantidad);
    }
}
