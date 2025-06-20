package FormulaDeFisica;

import java.util.Scanner;
public class EquacaoFundamentalDaColorimetria {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double Q,m,c,t;

        System.out.print("Calcular a massa do corpo(kg ou g): ");
        m = sc.nextDouble();
        System.out.print("Calcular o calor especifico(J/Kg.ºC ou cal/GºC):  ");
        c = sc.nextDouble();
        System.out.print("Calcular a variacao da temperatura(ºC): ");
        t = sc.nextDouble();

        Q = m * c * t;

        System.out.println("O resultado da equacao fundamental da colorimetria e: " + Q);
        sc.close();
    }
}
