import java.util.Scanner;
public class tp1java {
   
 
    public static void main(String[] args) {
        float capital;
        float interes;
        int periodo;
        float total=0;
        Scanner Scanin= new Scanner(System.in);
        System.out.println("Ingrese el monto: ");
        capital=Scanin.nextFloat();
        System.out.println("Ingrese la tasa de interes porcentaje");
        interes=Scanin.nextFloat();
        System.out.println("Ingrese el periodo en meses ");
        periodo=Scanin.nextInt();
        interes=interes/100;
        total=capital+(capital*interes)*periodo;
        System.out.println("Monto total a pagar: "+total);
        double parteEntera=Math.floor(total);
        System.out.println("Parte entera: "+parteEntera);
        System.out.println("Parte decimal: "+(total-parteEntera));
    }
}
