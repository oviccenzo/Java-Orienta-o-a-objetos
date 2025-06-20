package FormulaDeFisica;

import java.util.Scanner;

public class EnergiaCinetica {

    public static void main(String[] args){

        double EnergiaCinetica, Massa, Velocidade;

        Scanner sc = new Scanner(System.in);

        System.out.print("Calcular a massa(KG): ");
        Massa = sc.nextDouble();
        System.out.print("Calcular a velocidade(M/S): ");
        Velocidade = sc.nextDouble();

        EnergiaCinetica = 0.5 * Massa * Math.pow(Velocidade,2) / 2;

        System.out.print("O resultado da energia cinetica e: " + EnergiaCinetica);
    }
}