package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Ejemplo015 {
    /*
    Una empresa les paga a sus empleados con base en las horas trabajadas en la
    semana. Para esto, se registran los días que laboró y las horas de cada día.
    Determinar el sueldo semanal de N trabajadores y además calcule cuánto pagó 
    la empresa por los N empleados. 
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el pago semanal de \"N\" "
                + "empleados y el total de pago a los empleados ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngrese la cantidad de empleados que desea calcular"
                + " su sueldo: ");
        int numEmpleados = n.nextInt();
        
        System.out.println("");
        
        float pagoT = 0;
        
        for (int i = 1; i <= numEmpleados; i++){
            System.out.print("Ingresa el número de días trabajados por el empleado"
                    + " ["+i+"]: ");
            int diasT = n.nextInt();
            System.out.print("Ingresa el pago por hora del trabajador ["+i+"]: $");
            float pagoH = n.nextFloat();
            System.out.println("");
            
            float sumaHoraSemana = 0;
            for (int j = 1; j <= diasT; j++){
                System.out.print("Ingresa las horas trabajadas el día ["+j+"] del"
                        + " trabajador ["+i+"]: ");
                int horasT = n.nextInt();
                sumaHoraSemana+=horasT;
            }
            
            float sueldoSemanal = sumaHoraSemana * pagoH;
            System.out.print("\nEl sueldo semanal del empleado ["+i+"] es de: $" +
                    sueldoSemanal);
            pagoT+=sueldoSemanal;
            System.out.println("\n");
        }
        
        System.out.println("El pago total por los ["+numEmpleados+"] empleados es de: $" +
                pagoT);
    }
   
}
