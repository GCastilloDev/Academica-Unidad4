package propuestos;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Propuesto022 {
    /*
    El banco “Bandido de peluche” desea calcular para cada uno de sus N clientes
    su saldo actual, su pago mínimo y su pago para no generar intereses. Además,
    quiere calcular el monto de lo que ganó por concepto interés con los clientes
    morosos. Los datos que se conocen de cada cliente son: saldo anterior, monto
    de las compras que realizó y pago que depositó en el corte anterior.
    Para calcular el pago mínimo se considera 15% del saldo actual, y el pago
    para no generar intereses corresponde a 85% del saldo actual, considerando
    que el saldo actual debe incluir 12% de los intereses causados por no realizar
    el pago mínimo y $200 de multa por el mismo motivo.
    */
    
    public static float obtenerSaldoActual(float saldoAnterior, float montoCompras, float pagoAnterior){
        float saldoActual = saldoAnterior + montoCompras - pagoAnterior;
        return saldoActual;
    }
    
    public static float obtenerPagoMinimo(float saldoAnterior, float montoCompras, float pagoAnterior){
        float pagoMinimo = obtenerSaldoActual(saldoAnterior,montoCompras,pagoAnterior) * 0.15f;
        return pagoMinimo;
    }
    
    public static float obtenerPagoNoIntereses(float saldoAnterior, float montoCompras, float pagoAnterior){
        float intereses = obtenerSaldoActual(saldoAnterior,montoCompras,pagoAnterior) * 0.12f;
        float saldo = obtenerSaldoActual(saldoAnterior,montoCompras,pagoAnterior) * 0.85f;
        if(pagoAnterior<=0) return intereses;
        else return saldo + intereses + 200;       
    }
    
    /*public static float obtenerIntereses(float saldoAnterior, float montoCompras, float pagoAnterior){
        return obtenerSaldoActual(saldoAnterior,montoCompras,pagoAnterior) * 0.12f;
    }*/
    
    public static void imprimirReporte(float saldoAnterior, float montoCompras, float pagoAnterior, int opcion){    
        
        Locale mx = new Locale("es","MX");
        NumberFormat f = NumberFormat.getCurrencyInstance(mx);
        
        switch (opcion) {
            case 1:
                System.out.println("\nSaldo actual " + 
                        f.format(obtenerSaldoActual(saldoAnterior,montoCompras,pagoAnterior)));
                break;
            case 2:
                System.out.println("\nPago mínimo " + 
                        f.format(obtenerPagoMinimo(saldoAnterior,montoCompras,pagoAnterior)));
                break;
            case 3:
                System.out.println("\nPago para no generar intereses " +
                        f.format(obtenerPagoNoIntereses(saldoAnterior,montoCompras,pagoAnterior)));
                break;
            case 4:
                System.out.println("\nSaldo actual \t\t\t\t" + 
                        f.format(obtenerSaldoActual(saldoAnterior,montoCompras,pagoAnterior)));
                System.out.println("Pago mínimo \t\t\t\t" + 
                        f.format(obtenerPagoMinimo(saldoAnterior,montoCompras,pagoAnterior)));
                System.out.println("Pago para no generar intereses \t\t" +
                        f.format(obtenerPagoNoIntereses(saldoAnterior,montoCompras,pagoAnterior)));
                break;
            default:
                System.out.println("\nOPCIÓN INVÁLIDA");
                break;
        }    
    }
    
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula saldo actual, pago mínimo y pago para no generar"
                + " intereses del banco \"Bandido de Peluche\" ***");
        
        Scanner n = new Scanner(System.in);
        Locale mx = new Locale("es","MX");
        NumberFormat f = NumberFormat.getCurrencyInstance(mx);
        
        boolean entrar = true;
        float interesesGanados = 0;
        
        while(entrar==true){
            System.out.print("\nIngrese su saldo anterior $");
            float saldoAnterior = n.nextFloat();
            System.out.print("Ingrese el monto de las compras realizadas en este ciclo $");
            float montoCompras = n.nextFloat();
            System.out.print("Ingrese el pago que realizó del corte anterior $");
            float pagoAnterior = n.nextFloat();
             System.out.print("\nBienvenido \n1) Saldo actual \n2) Pago mínimo "
                + "\n3) Pago para no generar intereses \n4) Todas las anteriores"
                + "\n\n¿Qué opción desea saber? ");
            int opcion = n.nextInt();    
            
            if (pagoAnterior<=0){
                interesesGanados+= obtenerPagoNoIntereses(saldoAnterior,montoCompras,pagoAnterior);
            }
            
            imprimirReporte(saldoAnterior, montoCompras, pagoAnterior, opcion);
            
            System.out.print("\n¿Desea realizar los calculos para otro cliente? 1 para si"
                    + " 2 para no: ");
            entrar = n.nextInt()==1?true:false;
        }
        
        System.out.println("intereses ganados: " + f.format(interesesGanados));
    }
}
