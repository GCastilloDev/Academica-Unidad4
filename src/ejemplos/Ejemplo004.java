package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo004 {
    /*
    Obtener la edad promedio de un grupo de N alumnos.
    */  
    public float promedioEdad(int alumnos){
        Scanner n = new Scanner(System.in);
        float suma = 0f; 
        int edad;
        for (int i=1;i<=alumnos;i++){
            System.out.print("Ingresa la edad del alumno ["+i+"]: ");
            edad = n.nextInt();
            suma = suma + edad;
        }
        float promedio = suma / alumnos;
        return promedio;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el promedio de edad de \"N\" "
                + "alumnos ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngrese la cantidad de alumnos que desea ingresar: ");
        int alumnos = n.nextInt();
        
        Ejemplo004 obj = new Ejemplo004();
        
        System.out.println("\nEl promedio de edad es: " + obj.promedioEdad(alumnos));
    }
}
