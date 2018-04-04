package propuestos;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto015 {
    /*
    Determine el sueldo semanal de N trabajadores considerando que se les
    descuenta 5% de su sueldo si ganan entre 0 y 150 pesos. Se les descuenta 7%
    si ganan más de 150 pero menos de 300, y 9% si ganan más de 300 pero menos 
    de 450. Los datos son horas trabajadas, sueldo por hora y nombre de cada 
    trabajador.
    *Nota: se modificaran a 1500, 3000 y 4500 los montos para darle mas realizmo.
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que determina el sueldo de \"N\" "
                + "trabajadoras ***\n");
        
        Scanner n = new Scanner(System.in);        
               
        System.out.print("¿Desea calcular el sueldo de algún trabajador? 1 para si 2 para no: ");
        boolean entrar = n.nextInt()==1?true:false;
                                      
        while(entrar == true){
            
            Scanner l = new Scanner(System.in);
            System.out.print("Ingrese el nombre del trabajador: ");
            String nombre = l.nextLine();
            System.out.print("Ingrese las horas trabajadas de " + nombre + ": ");
            int horasT = n.nextInt();
            System.out.print("Ingrese el sueldo por horas: $");
            float salario = n.nextFloat();
                        
            salario*=horasT;
            Locale mx = new Locale("es","MX");
            NumberFormat f = NumberFormat.getCurrencyInstance(mx);
            
            System.out.println("\nNómina de " + nombre+" :");
            System.out.println("Salario sin descuento \t\t" + f.format(salario));
            
            float descuento = 0;          
            
            if (salario <= 1500) descuento = salario * 0.05f;
            else if (salario <= 3000) descuento = salario * 0.07f;
            else if (salario < 4500) descuento = salario * 0.09f;
            
            System.out.println("El descuento es de \t\t" + f.format(descuento));
            salario-=descuento;
            System.out.println("Salario a pagar \t\t" + f.format(salario));
            
            System.out.print("\n¿Desea calcular el salario de otro trabajador? "
                    + "1 para si 2 para no: ");
            entrar = n.nextInt()==1?true:false;
        }
        
        if(entrar==false) System.out.println("Gracias por usar el programa!!");
    }
}
