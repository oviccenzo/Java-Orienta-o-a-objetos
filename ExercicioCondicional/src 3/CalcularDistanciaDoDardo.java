import java.util.Locale;
import java.util.Scanner;

public class CalcularDistanciaDoDardo {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro dardo: ");
        double primeiroDardo = sc.nextDouble();

        System.out.print("Digite o segundo dardo: ");
        double segundoDardo = sc.nextDouble();

        System.out.print("Digite o terceiro dardo: ");
        double terceiroDardo = sc.nextDouble();

        if(primeiroDardo > segundoDardo && primeiroDardo > terceiroDardo){
            System.out.print("Maior distancia = " + primeiroDardo);
        } else if(segundoDardo > primeiroDardo && segundoDardo > terceiroDardo){
            System.out.print("Maior distancia = " + segundoDardo);
        } else {
            System.out.print("Maior distancia = " + terceiroDardo);
        }
    }
}
