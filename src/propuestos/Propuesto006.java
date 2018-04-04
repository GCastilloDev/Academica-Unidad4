package propuestos;
/**
 *
 * @author Gustavo
 */
public class Propuesto006 {
    /*
    Resuelva el problema 4.1(Propuesto001), mediante:
    a) un ciclo Repite (DoWhile)
    y b) un ciclo Desde (for) 
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el incremente del salario de "
                + "un profesor por 6 años con ciclos doWhile y For ***\n");
        
        System.out.println("Ciclo \"for\"");
        for (int i = 1; i <= 1; i++){
            float salarioF = 1500;
            for (int j = 1; j <= 6; j++){
                salarioF *=  1.10f;
                System.out.println("El salario del año ["+j+"] es $" + salarioF);
            }
            System.out.println("\nEl salario final es de $" + salarioF);
        }
        
        System.out.println("\nCiclo \"do while\"");
        
        float salarioF = 1500;
        int anio = 0;
        
        do{
           anio++;
           salarioF *= 1.10f; 
           System.out.println("El salario del año ["+anio+"] es $" + salarioF); 
        }
        while (anio < 6);
         System.out.println("\nEl salario final es de $" + salarioF);
    }
}
