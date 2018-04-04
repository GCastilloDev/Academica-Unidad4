package propuestos;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto019 {
    /*
    El gerente de una compañía automotriz desea determinar el impuesto que va a
    pagar por cada uno de los automóviles que posee, además del total que va a 
    pagar por cada categoría y por todos los vehículos, basándose en la 
    siguiente clasificación:
    Los vehículos con clave 1 pagan 10% de su valor.
    Los  vehículos con clave 2 pagan 7% de su valor. 
    Los vehículos con clave 3 pagan 5% de su valor.
    Los datos son la clave y costo de cada uno. 
    */
    public static float obtenerImpuesto1(float costo){
        return costo * 0.10f;
    }
    
    public static float obtenerImpuesto2(float costo){
        return costo * 0.07f;
    }
    
    public static float obtenerImpuesto3(float costo){
        return costo * 0.05f;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Calcular impuestos a pagar de un inventario de"
                + " vehículos ***\n");
        
        Scanner n = new Scanner(System.in);
        Locale mx = new Locale("es","MX");
        NumberFormat f = NumberFormat.getCurrencyInstance(mx);
        
        System.out.print("¿Desea hacer el calculo de impuestos del inventario? 1 para si"
                + " 2 para no: ");
        boolean entrar = n.nextInt()==1?true:false;
        
        float impuestoCat1 = 0;
        float impuestoCat2 = 0;
        float impuestoCat3 = 0;
        
        while(entrar==true){
            
            System.out.print("\nIngresa el costo del vehículo: $");
            float costo = n.nextFloat();
            System.out.print("Ingrese la clave del vehículo: ");
            int clave = n.nextInt();              
                        
            switch (clave) {
                case 1:
                    System.out.println("El impuesto a pagar por este vehículo es: "
                            + f.format(obtenerImpuesto1(costo)));
                    impuestoCat1+=obtenerImpuesto1(costo);
                    break;
                case 2:
                    System.out.println("El impuesto a pagar por este vehículo es: "
                            + f.format(obtenerImpuesto2(costo)));
                    impuestoCat2+=obtenerImpuesto2(costo);
                    break;
                case 3:
                    System.out.println("El impuesto a pagar por este vehículo es: "
                            + f.format(obtenerImpuesto3(costo)));
                    impuestoCat3+=obtenerImpuesto3(costo);
                    break;
                default:
                    System.out.println("OPCIÓN INVÁLIDA");
                    break;
            }
            
            System.out.print("¿Desea agregar otro vehículo al cálculo? 1 para si"
                    + " 2 para no: ");
            entrar = n.nextInt()==1?true:false;
        }
        
        System.out.println("\nCategoría \tMonto");
        System.out.println("1 \t\t" + f.format(impuestoCat1));
        System.out.println("2 \t\t" + f.format(impuestoCat2));
        System.out.println("3 \t\t" + f.format(impuestoCat3));
        
        float total = impuestoCat1 + impuestoCat2 + impuestoCat3;
        
        System.out.println("Total \t\t" + f.format(total));
    }
}
