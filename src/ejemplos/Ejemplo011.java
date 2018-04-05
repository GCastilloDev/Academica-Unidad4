package ejemplos;

/**
 *
 * @author Gustavo
 */
public class Ejemplo011 {
    /*
    Una persona se encuentra en el kilómetro 70 de la carretera 
    Aguascalientes-Zacatecas, otra se encuentra en el km 150 de la misma 
    carretera, la primera viaja en dirección a Zacatecas, mientras que la
    segunda se dirige a Aguascalientes, a la misma velocidad. 
    Determinar en qué kilometro de esa carretera se encontrarán.
    */
    public static void main(String[] args) {
       
        System.out.println("*** Programa que calcula punto de encuentro de dos"
                + " personas ***");
        
       int puntoA = 70;
       int puntoB = 150;
       
       float distancia = puntoB - puntoA;
       
       while (distancia > 0){
           puntoA++;
           puntoB--;
           distancia = puntoB - puntoA;
       }
       
       distancia = distancia==0?puntoA:puntoA-0.5f;
       
        System.out.println("\nSu punto de encuentro es el km " + distancia);
    }
}
