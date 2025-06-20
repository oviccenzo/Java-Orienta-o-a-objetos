import java.util.Scanner;
import java.util.Locale;

public class GlicoseNoSangue{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double glicose = sc.nextDouble();

        if(glicose < 100){
            System.out.print("Classificação: Normal");
        } else if(glicose <= 140){
            System.out.print("Classificação: Elevado");
        }else {
            System.out.print("Classificação: Diabetes");
        }
    }
}