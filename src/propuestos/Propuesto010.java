package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto010 {
        
    /*
    Los directivos de equis escuela requieren determinar cuál es la edad
    promedio de cada uno de los M salones y cuál es la edad promedio de toda 
    la escuela. Determinar estos promedios
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula los promedios de edad de "
                + "toda la escuela y de cada uno de sus grupos ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("¿Cuál es el nombre de la escuela? ");
        String escuelaN = n.nextLine();
        System.out.print("¿Cuántos grupos tiene la escuela \"" + escuelaN +"\"? ");
        int grupos = n.nextInt();
        
        float promedioEscuela = 0;
        
        for (int i = 1; i <= grupos; i++){
            System.out.print("\n¿Cuántos alumnos tiene el grupo "+i+"?: ");
            int alumnos = n.nextInt();
            
            float promedioGrupo = 0;
            
            for (int j = 1; j <= alumnos; j++){
                System.out.print("¿Que edad tiene el alumno ["+j+"] del grupo ["+i+"]?: ");
                int edad = n.nextInt();
                promedioGrupo+=edad;
            }
            
            promedioGrupo/=alumnos;
            System.out.println("El promedio de edad del grupo "+i+" es de: " + promedioGrupo);
            promedioEscuela+=promedioGrupo;
        }
        
        promedioEscuela/=grupos;
        System.out.println("\nEl promedio de edad de la escuela " + escuelaN + " es de: " + promedioEscuela);
    }
}
