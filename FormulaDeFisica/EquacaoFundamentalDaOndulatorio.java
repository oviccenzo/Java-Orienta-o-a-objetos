package FormulaDeFisica;

import java.util.Scanner;
public class EquacaoFundamentalDaOndulatorio {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double A,V,F;

        System.out.print("Calcular a frequencia ondulatoria: ");
        A = sc.nextDouble();
        System.out.print("Calcular a velocidade ondulatoria: ");
        V = sc.nextDouble();
        F = A * V;

        System.out.printf("O resultado da equacao fundamental da ondulacao e: %.1f\n" , F);
        sc.close();
    }
}
