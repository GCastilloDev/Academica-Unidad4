package ejemplos;

/**
 *
 * @author Gustavo
 */
public class Ejemplo008 {
    /*
    Generar e imprimir los números pares que se encuentran entre 0 y 100.
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que genera e imprime los número pares"
                + " del 0 al 100 ***");
        
        for(int i=1;i<=100;i++){
            
            if(i%2==0){
                System.out.println("Número par: " + i);
            }
        }
    }
}
