package src1;

import java.util.Locale;
import java.util.Scanner;

public class exemplo11 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char opcao;
        double c, f;
        do{
            System.out.print("Digite a temperatura em Celcius: ");
            c = sc.nextDouble();
            f = (9*c)/5 + 32;
            System.out.printf("A temperatura em Fahrenheit: %.1f %n",f);
            System.out.print("Deseja Repetir (s/n): ");
            opcao = sc.next().charAt(0);
        }while (opcao == 's' || opcao == 'S');
        sc.close();
    }
}
