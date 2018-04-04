package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo003 {
    /*
    Obtener la suma de diez cantidades mediante la utilización de un
    ciclo Desde. 
    */
    public float sumarDiezNum(){
        Scanner n = new Scanner(System.in);
        float suma = 0f, num;
        for(int i=1;i<=5;i++){
            System.out.print("Ingrese el número ["+i+"] a sumar: ");
            num = n.nextFloat();
            suma = suma + num;      
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("*** Programa que suma 10 numeros ***");
        
        Ejemplo003 obj = new Ejemplo003();
                
        System.out.println("\nEl resultado de la suma es: " + obj.sumarDiezNum());
    }    
}
