package propuestos;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto021 {
    /*
    Determinar qué cantidad de dinero hay en un monedero, considerando que se
    tienen monedas de diez, cinco y un peso, y billetes de diez, veinte y 
    cincuenta pesos. 
    */
    public static void main(String[] args) {
        
        System.out.println("*** Programa que calcula la cantidad de dinero que"
                + " hay en un monedero ***\n");
        
        Scanner n = new Scanner(System.in);
        
        int acumulado = 0;
        
        for (int i=1; i<=6;i++){
            
            int cantidad = 0;
            
            switch (i) {
                case 1:
                    System.out.print("¿Cuantas monedas de diez pesos tienes?: ");
                    cantidad = n.nextInt();
                    cantidad*=10;
                    acumulado+=cantidad;
                    break;
                case 2:
                    System.out.print("¿Cuantas monedas de cinco pesos tienes?: ");
                    cantidad = n.nextInt();
                    cantidad*=5;
                    acumulado+=cantidad;
                    break;
                case 3:
                    System.out.print("¿Cuantas monedas de un peso tienes?: ");
                    cantidad = n.nextInt();
                    cantidad*=1;
                    acumulado+=cantidad;
                    break;
                case 4:
                    System.out.print("¿Cuantos billetes de diez pesos tienes?: ");
                    cantidad = n.nextInt();
                    cantidad*=10;
                    acumulado+=cantidad;
                    break;
                case 5:
                    System.out.print("¿Cuantos billetes de veinte pesos tienes?: ");
                    cantidad = n.nextInt();
                    cantidad*=20;
                    acumulado+=cantidad;
                    break;
                case 6:
                    System.out.print("¿Cuantos billetes de cincuenta pesos tienes?: ");
                    cantidad = n.nextInt();
                    cantidad*=50;
                    acumulado+=cantidad;
                    break;
            }            
        }
        
        Locale mx = new Locale("es","MX");
        NumberFormat f = NumberFormat.getCurrencyInstance(mx);
        
        System.out.println("\nLa cantidad que hay en el monedero es: " + f.format(acumulado));
    }
}
