import java.util.Scanner;
import java.util.Locale;

public class MediaPonderada{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos caso voce vai digitar? ");
        int n = sc.nextInt();

        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        int totalDePeso = peso1 + peso2 + peso3;

        for(int i = 0; i < n; i++){
            System.out.print("Digite numero um: ");
            double valor1 = sc.nextDouble();
            System.out.print("Difite numero dois: ");
            double valor2 = sc.nextDouble();
            System.out.print("Digite numero tres: ");
            double valor3 = sc.nextDouble();

            double mediaPonderada = (peso1 * valor1 + peso2 * valor2 + peso3 * valor3) / totalDePeso;

            System.out.printf("A media ponderada = %.1f%n" , mediaPonderada);
        }
    }
}
