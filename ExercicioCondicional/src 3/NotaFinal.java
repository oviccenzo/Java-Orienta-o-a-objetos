import java.util.Locale;
import java.util.Scanner;

public class NotaFinal{
    public static void main(String[] args){

        Locale.setDefault( Locale.US );
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = sc.nextDouble();

        double notaFinal =  (primeiraNota + segundaNota );

        System.out.printf("Nota Final = %.1f%n", notaFinal);

        if(notaFinal < 60.00){
            System.out.println("Reprovado");
        } else{
            System.out.println("Aprovado");
        }
    }
}