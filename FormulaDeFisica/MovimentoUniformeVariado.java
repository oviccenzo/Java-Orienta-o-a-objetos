package FormulaDeFisica;

import java.util.Scanner;

public class MovimentoUniformeVariado {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double V0,S0,a,t,S;

        System.out.print("Calcular a posicao inicial(S0): ");
        S0 = sc.nextDouble();
        System.out.print("Calcular a velocidade inicial: ");
        V0 = sc.nextDouble();
        System.out.print("Calcular o tempo(T): ");
        t = sc.nextDouble();
        System.out.print("Calcular a aceleracao inicial: ");
        a = sc.nextDouble();

        S = S0 + V0 * t + a * Math.pow(t,2) /2;

        System.out.print("O resultado do movimento e: " + S);
    }
}
