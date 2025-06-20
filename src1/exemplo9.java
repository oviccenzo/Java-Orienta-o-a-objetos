package src1;

import java.util.Locale;
import java.util.Scanner;

public class exemplo9 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor = 1;
        int soma = 0;
        while (valor != 0){
            System.out.print("Digite um valor: ");
            valor = sc.nextInt();
            //soma = soma + valor;
            soma += valor;
        }
        System.out.printf("O valor da soma é: %d %n", soma);
        sc.close();
    }
}
