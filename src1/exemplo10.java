package src1;

import java.util.Locale;
import java.util.Scanner;

public class exemplo10 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor;
        int num;
        int soma = 0;

        System.out.print("Digite o valor de N: ");
        valor = sc.nextInt();
        for (int i = 0; i < valor; i++) {
            System.out.print("Digite um valor:");
            num = sc.nextInt();
            //soma = soma + num;
            soma += num;

        }
        System.out.println("A soma é: " + soma);
        sc.close();
    }
}
