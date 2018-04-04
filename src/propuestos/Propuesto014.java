package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto014 {
    /*
    Leer las calificaciones de N alumnos y determine el número de aprobados y reprobados. 
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el número de aprobados y reprobados"
                + " de una cantidad de alumnos en base 100 ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingrese el número de alumnos a capturar: ");
        int cantidad = n.nextInt();
        
        int aprobados = 0;
        int reprobados = 0;
        
        for (int i=1; i<=cantidad; i++){
            System.out.print("Ingrese la calificación del alumno ["+i+"] en base 100: ");
            int cali = n.nextInt();
            
            if(cali>=80) aprobados++;
            else reprobados++;
        }
        
        System.out.println("\nAlumnos aprobados: " + aprobados);
        System.out.println("Alumnos reprobados: " + reprobados);
    }
}
