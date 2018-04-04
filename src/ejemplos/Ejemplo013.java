package ejemplos;
import java.math.BigDecimal;
/**
 *
 * @author Gustavo
 */
public class Ejemplo013 {
    /*
    Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó
    $10, el segundo $20, el tercero $40 y así sucesivamente. Determinar cuánto 
    debe pagar mensualmente y el total de lo que pagó después de los 20 meses
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el pago mensual y el total"
                + " después de los 20 meses ***\n");
        
        BigDecimal pagoMensual = new BigDecimal(5);
        BigDecimal pagoTotal = new BigDecimal(0);
        BigDecimal factor = new BigDecimal(2);
        
        for(int i= 1; i<=20; i++){
            pagoMensual = pagoMensual.multiply(factor);
            System.out.println("El pago del mes ["+i+"] es de $" + pagoMensual);
            pagoTotal = pagoTotal.add(pagoMensual);
        }
        
        System.out.println("El pago total de los 20 meses es $" + pagoTotal);
    }
}
