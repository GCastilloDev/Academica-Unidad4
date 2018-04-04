package propuestos;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Propuesto002 {
    /*
    “El náufrago satisfecho” ofrece hamburguesas sencillas (S), dobles (D) y
    triples (T), las cuales tienen un costo de $20, $25 y $28 respectivamente.
    La empresa acepta tarjetas de crédito con un cargo de 5 % sobre la compra. 
    Suponiendo que los clientes adquieren N hamburguesas, las cuales pueden ser 
    de diferente tipo, cuánto deben pagar.
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el ticket de un restaurante"
                + " de hamburguesas ***");
        
        Scanner n = new Scanner(System.in);
        
        int contador = 0;
        int contadorS = 0;
        int contadorD = 0;
        int contadorT = 0;        
        int tipoPago = 0;
        float acumuladorS = 0;
        float acumuladorD = 0;
        float acumuladorT = 0;
        boolean validar = true;
        boolean repetir = false;
                
        do{
            
            if (validar == true){
            System.out.print("\nMenú: \nHamburguesa Sencilla \t$20.00 \nHamburguesa"
                    + " Doble \t$25.00 \nHamburguesa Triple \t$28.00 \n***Cargo por"
                    + " tarjeta del 5%***");
            System.out.println("\n");
            }
                                   
            System.out.print("¿Que tipo de hamburgesa desea ordenar? 1 para Sencilla"
                    + " 2 para Doble y 3 para Triple: ");
            int tipo = n.nextInt();
            
            switch (tipo) {
                case 1:
                    System.out.print("¿Cuántas hamburguesas sencillas desea? ");
                    contador = n.nextInt();
                    acumuladorS+=contador * 20;
                    contadorS+=contador;
                    contador = 0;
                    break;
                case 2:
                    System.out.print("¿Cuántas hamburguesas dobles desea? ");
                    contador = n.nextInt();
                    acumuladorD+=contador * 25;
                    contadorD+=contador;
                    contador = 0;
                    break;
                case 3:
                    System.out.print("¿Cuántas hamburguesas triples desea? ");
                    contador = n.nextInt();
                    acumuladorT+=contador * 28;
                    contadorT+=contador;
                    contador = 0;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            
            System.out.print("¿Desea pedir algo más? 1 para sí ó 2 para no: ");
            int opc = n.nextInt();
            repetir = opc==1?true:false;
            if(repetir==true){
            System.out.print("¿Desea ver el menú? 1 para sí ó 2 para no: ");
            opc = n.nextInt();
            validar = opc==1?true:false;
            }
            else{
                System.out.print("\n1) Efectivo \n2) Tarjeta \nTipo de pago: ");
                tipoPago = n.nextInt();
                System.out.println("\n");
            }                    
        }
        while(repetir==true);
        
        DecimalFormat f= new DecimalFormat("#0.00");
        
        float pagoTotal = acumuladorS + acumuladorD + acumuladorT;
        float cargoTarjeta = 0;
        
        System.out.println("Cantidad \tDescripción \t\t\tCosto Unitario \t\tTotal");
        if (contadorS > 0) System.out.println("" + contadorS + "\t\tHamburguesa "
                + "Sencilla \t\t$20.00 \t\t\t$" + f.format(acumuladorS));
           
        if (contadorD > 0) System.out.println("" + contadorD + "\t\tHamburguesa "
                + "Doble \t\t$25.00 \t\t\t$" + f.format(acumuladorD));
        
        if (contadorT > 0) System.out.println("" + contadorT + "\t\tHamburguesa "
                + "Triple \t\t$28.00 \t\t\t$" + f.format(acumuladorT));
            
        if (tipoPago == 2){
            System.out.println("\n\t\t\t\t\t\t\tSubTotal \t$" + f.format(pagoTotal));
            cargoTarjeta = pagoTotal * 0.05f;
            pagoTotal += cargoTarjeta;
            System.out.println("\t\t\t\t\t\t\tCargo tarjeta \t$" + f.format(cargoTarjeta));
            System.out.println("\t\t\t\t\t\t\tTotal \t\t$" + f.format(pagoTotal));
        }
        else{
            System.out.println("\n\t\t\t\t\t\t\t\tTotal \t$" + f.format(pagoTotal));
        }
    }
}
