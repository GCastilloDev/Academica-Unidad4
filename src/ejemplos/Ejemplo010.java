package ejemplos;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Ejemplo010 {
    /*
    Una empresa tiene el registro de las horas que trabaja diariamente un
    empleado durante la semana (seis días) y requiere determinar el total de
    éstas, así como el sueldo que recibirá por las horas trabajadas
    */
    public static float sueldoSemanal(float salarioHora, int horasTotal){
        return salarioHora * horasTotal;
    }
    
    public static void imprimirSalarioHoras(float salarioHora, int horasTotal){
        DecimalFormat f = new DecimalFormat("#0.00");
        System.out.println("\nTu salario correspondiente a esta semana es $" +
                f.format(sueldoSemanal(salarioHora,horasTotal)));
        System.out.println("Esta semana trabajaste " + horasTotal + " horas.");
    }
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el sueldo semanal y las horas"
                + " trabajadas ***");    
        
        Scanner n = new Scanner (System.in);
        
        System.out.print("Ingresa tu salario por hora $");
        float salarioHora = n.nextInt();
        
        int horasTotal = 0;       
        for(int i=1;i<=6;i++){
            System.out.print("Ingrese las horas trabajadas del día ["+i+"]: ");
            int horas = n.nextInt();
            horasTotal += horas;
        }
        
        imprimirSalarioHoras(salarioHora,horasTotal);
    }
}
