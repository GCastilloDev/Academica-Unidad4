package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto020 {
    /*
    Realice un algoritmo para obtener el seno de un ángulo.
    Serie de Taylor.
    */
    public static double obtenerFactorial(int num){
        double resultado = 1;
        for (int i=1; i<=num;i++)
        {
            resultado*=i;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el seno de un ángulo ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingrese el valor del ángulo que desea su seno: ");
        double x = n.nextDouble();
        
        double seno = 0;
        double dividendo;
        double divisor;
        double signo = 0;
      
        for (int i=0; i <= 10; i++){
                     
            dividendo = 1;
            divisor = 1;
            for(int j=0; j<(2*i+1);j++){
                dividendo *= x;
                divisor = obtenerFactorial(2*i+1);
            }
                      
            if(i%2==0) {
                signo = 1;
            }
            else {
                signo = -1;
            }
            
            seno += (dividendo / divisor) * signo;
        }
        
        System.out.println("sen("+x+") = " + seno);
    }
}

