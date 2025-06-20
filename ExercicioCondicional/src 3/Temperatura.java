import java.util.Scanner;
import java.util.Locale;

public class Temperatura{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala(C/F)? ");
        char escala = sc.next().charAt(0);

        if(escala == 'F' || escala == 'f'){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double f = sc.nextDouble();
            double c = (f - 32) * 5/9;
            System.out.printf("Temperatura equivalente em celsius: %.2f%n",c);
        } else if(escala == 'C' || escala == 'c'){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double c = sc.nextDouble();
            double f = (c * 9.0 / 5.0) + 32;
            System.out.printf("Temperatura equivalente em celsius: %.2f%n", f);
        }
    }
}
