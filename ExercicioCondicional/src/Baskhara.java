import java.util.Scanner;
import java.util.Locale;

public class Baskhara{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Coeficientes a: ");
        double a = sc.nextDouble();

        System.out.print("Coeficientes b: ");
        double b = sc.nextDouble();

        System.out.print("Coeficientes c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b,2.0) - 4 * a * c;

        if(delta > 0){

            double x1 = (-b + Math.sqrt(delta)) / (2.0 * a); 
            double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("As raizes da equação x1 = %.4f%n e x2 = %.4f%n",x1,x2);
        } else {
            System.out.printf("Esta equação não possui raizes reais");
        }
    }
}
