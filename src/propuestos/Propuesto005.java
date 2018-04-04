package propuestos;

import java.math.BigDecimal;
/**
 *
 * @author Gustavo
 */
public class Propuesto005 {
    /*
    Determinar cuánto ahorrará en pesos una persona diariamente, y en un año
    si ahorra 3¢ el primero de enero, 9¢ el dos de enero, 27¢ el 3 de enero y
    así sucesivamente todo el año. 
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el ahorro diario de una persona"
                + " durante todo el año ***\n");
        
        BigDecimal ahorro = new BigDecimal(0.03);
        BigDecimal factor = new BigDecimal(3);
        BigDecimal ahorroT = new BigDecimal(0.03);
          
        for (int i = 0; i < 365; i++){
            System.out.println("El ahorro del día ["+(i+1)+"] es $" + ahorro);
            ahorro = ahorro.multiply(factor);
            ahorroT = ahorroT.add(ahorro);
        }
        
        System.out.println("El ahorro de todo el año es \n$" + ahorroT.toString());
    }
}
