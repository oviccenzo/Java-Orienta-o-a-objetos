package src1;

import java.util.Locale;
import java.util.Scanner;

public class exemplo8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        String dia;

        System.out.println("Digite uma numero: ");
        numero = sc.nextInt();

        switch (numero){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia ="sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia ="valor inválido";
                break;
        }
        System.out.printf("dia da semana: %s", dia);
    }
}
