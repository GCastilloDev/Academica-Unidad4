package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Ejemplo014 {
    /*
    Una empresa les paga a sus empleados con base en las horas trabajadas en la
    semana. Determinar el sueldo semanal de N trabajadores y, además, calcule
    cuánto pagó la empresa por los N empleados.
    */
    public static void main(String[] args) {
        System.out.println("***Programa que calcula el sueldo semanal de \"N\" "
                + "trabajadores y el total por los trabajadores ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa el número de empleados que desea calcular su sueldo: \n");
        int numEmpleados = n.nextInt();
        
        float pagoTotal = 0;
        
        for(int i = 1; i <= numEmpleados; i++){
            System.out.print("Ingrese las horas trabajadas del empleado ["+i+"]: ");
            int horasT = n.nextInt();
            System.out.print("Ingrese el pago por hora: $");
            float pagoHora = n.nextFloat();
            float pagoEmpleado = pagoHora * horasT;
            System.out.println("Pago semanal correspondiente al empleado ["+i+"] $" + pagoEmpleado);
            pagoTotal+=pagoEmpleado;
        }
        
        System.out.println("\nEl pago total de los empleados fué $" + pagoTotal);
    }
}
