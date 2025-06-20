package FormulaDeFisica;

import java.util.Scanner;

public class ForcaEletrica {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double F,K,Q,q, D;

        System.out.print("Calcular a constante de Eletrostatica(K): ");
        K = sc.nextDouble();
        System.out.print("Calcular a carga eletrica 1(Q): ");
        Q = sc.nextDouble();
        System.out.print("Calcular a carga eletrica 2(q): ");
        q = sc.nextDouble();
        System.out.print("Calcular a distancia(d): ");
        D = sc.nextDouble();

        F = K * (Q*q)/ Math.pow(D,2);

        System.out.print("O resultado da forca eletrica e: " + F);

        sc.close();
    }
}
