package src1;

import java.util.Locale;
import java.util.Scanner;

public class exemplo7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        int minutos;
        double valor;

        System.out.println("Digite o quantidade de minutos: ");
        minutos = sc.nextInt();
        valor = 50.0;
        if (minutos > 100){
            valor += (minutos - 100)*2.0;
            //valor = valor + (minutos - 100)*2.0;
        }
        System.out.printf("Valor a pagar: R$ %.2f %n",valor);
        sc.close();
    }
}
