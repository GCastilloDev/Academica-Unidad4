package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo002 {
    /*
    Obtener la suma de diez cantidades mediante la utilización de un
    ciclo Repite. 
    */
    public float sumarDiezNum(){
        Scanner n = new Scanner(System.in);
        float suma = 0f, num;
        int i = 1;
        do{
            System.out.print("Ingrese el número ["+i+"] a sumar: ");
            num = n.nextFloat();
            suma = suma + num;            
            i++;
        }
        while(i<=10);
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("*** Programa que suma 10 numeros ***");
        
        Ejemplo002 obj = new Ejemplo002();
                
        System.out.println("\nEl resultado de la suma es: " + obj.sumarDiezNum());
    }    
}
