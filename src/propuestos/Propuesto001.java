package propuestos;

/**
 *
 * @author Gustavo Shadow
 */
public class Propuesto001 {
    /*
    Un profesor tiene un salario inicial de $1500, y recibe un incremento de 10%
    anual durante 6 años. ¿Cuál es su salario al cabo de 6 años? 
    ¿Qué salario ha recibido en cada uno de los 6 años? 
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el incremente del salario de "
                + "un profesor por 6 años ***\n");
                      
        for (int i = 1; i <= 1; i++){
            float salarioF = 1500;
            for (int j = 1; j <= 6; j++){
                salarioF *=  1.10f;
                System.out.println("El salario del año ["+j+"] es $" + salarioF);
            }
            System.out.println("\nEl salario final es de $" + salarioF);
        }
    }
}
