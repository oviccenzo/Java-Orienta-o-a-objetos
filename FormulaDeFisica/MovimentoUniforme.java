package FormulaDeFisica;

import java.util.Scanner;

public class MovimentoUniforme {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float S, V, A,S0;

        System.out.print("Calcular a velocidade: ");
        V = sc.nextFloat();
        System.out.print("Calcular a aceleracao: ");
        A = sc.nextFloat();
        System.out.print("Calcular o espaço: ");
        S0 = sc.nextFloat();

        S = S0 + (V * A);

        System.out.print("O resultado do movimento e: " + S);

        sc.close();
    }
}
