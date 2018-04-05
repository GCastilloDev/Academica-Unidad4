package propuestos;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
/**
 *
 * @author Gustavo
 */
public class Propuesto018 {
    /*
    En 1961, una persona vendió las tierras de su abuelo al gobierno por la
    cantidad de $1500. Suponga que esta persona ha colocado el dinero en una
    cuenta de ahorros que paga 15% anual. ¿Cuánto vale ahora su inversión?
    P(1+i)^n Fórumala de interés compuesto.
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que proyecta una inversión ***\n");
        
        Calendar fecha = Calendar.getInstance();
        
        int anios = fecha.getWeekYear() - 1961;
        
        BigDecimal potencia = new BigDecimal(1);
        BigDecimal uno = new BigDecimal(1);
        BigDecimal interes = new BigDecimal(0.15);
        BigDecimal cantidadInicial = new BigDecimal(1500);
        Locale mx = new Locale("es","MX");
        NumberFormat f = NumberFormat.getCurrencyInstance(mx);
        
        for (int i=1; i <= anios; i++){
            potencia = potencia.multiply(uno.add(interes));
        }
        
        potencia=potencia.multiply(cantidadInicial);
        
        System.out.println("Cantidad inicial " + f.format(cantidadInicial));
        System.out.println("Periodo de intereses: 1961 - " + fecha.getWeekYear());
        System.out.println("Años a calcular: " + anios + " años.");
        System.out.println("Valor actual del su inversión: " + f.format(potencia));
    }
}
