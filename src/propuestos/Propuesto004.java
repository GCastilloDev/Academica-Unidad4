package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto004 {
    /*
    Una compañía fabrica focos de colores (verdes, blancos y rojos). Se desea
    contabilizar, de un lote de N focos, el número de focos de cada color que 
    hay en existencia.
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que contabiliza el inventario de "
                + "una fabrica de focos ***\n");
        
        int focoV = 0;
        int focoB = 0;
        int focoR = 0;
        
        Scanner n = new Scanner(System.in);
              
        System.out.print("¿Cuántos focos tiene el lote? ");
        int total = n.nextInt();
        
        for (int i = 1; i <= total; i++){
            System.out.print("\n1) Verde 2) Blanco 3) Rojo"
                    + "\n¿De qué color es el foco? ");
            int opc = n.nextInt();
            
            if (opc == 1) focoV++;
            else if (opc == 2) focoB++;
            else if (opc == 3) focoR++;
        }
        
        System.out.println("\nEl lote contiene " + total + " focos, de los cuales: ");
        System.out.println(focoV + " son de color verde.");
        System.out.println(focoB + " son de color blanco.");
        System.out.println(focoR + " son de color rojo.");
    }
}
