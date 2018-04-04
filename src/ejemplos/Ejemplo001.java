package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo001 {
    /*
    Obtener la suma de diez cantidades mediante la utilización de un ciclo
    “Mientras”.
    */
      
    public float sumarDiezNum(){
        Scanner n = new Scanner(System.in);
        float suma = 0f, num;
        int i = 1;
        while (i <= 10) {
            System.out.print("Ingrese el número ["+i+"] a sumar: ");
            num = n.nextFloat();
            suma = suma + num;            
            i++;
        }        
        return suma;
    }
                  
    public static void main(String[] args) {
        System.out.println("*** Programa que suma 10 numeros ***");
        
        Ejemplo001 obj = new Ejemplo001();
                
        System.out.println("\nEl resultado de la suma es: " + obj.sumarDiezNum());
    }    
}
    

