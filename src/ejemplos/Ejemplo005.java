package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo005 {
    /*
    Se requiere un algoritmo para obtener la estatura promedio de un grupo de 
    personas, cuyo número de miembros se desconoce, el ciclo debe efectuarse
    siempre y cuando se tenga una estatura registrada. 
    */
    public static float promedio (int contador, float suma){
        return suma / (contador - 1);
    }    
    
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula la estatura promedio de un "
                + "grupo de personas ***\n");
        
        Scanner n = new Scanner(System.in);
        int i = 0;
        float suma = 0f, estatura;
        
        do{
            i++;
            System.out.print("Introduce la estatura de la persona: ");
            estatura = n.nextFloat();
            suma = suma + estatura;            
        }
        while(estatura>0);
       
        System.out.println("\nEl promeido de estaturas de " + (i-1) + " personas"
                + " es: " + promedio(i,suma));
    }    
}
