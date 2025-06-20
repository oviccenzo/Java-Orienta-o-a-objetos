package FormulaDeFisica;

import java.util.Scanner;
public class EnergiaPontencialElastica {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double Epel,k,x;

        System.out.print("Calcular a constante elastica da mola, em N/m: ");
        k = sc.nextDouble();
        System.out.print("Calcular o deslocamento em relação á posição de equilibrio, em metros: ");
        x = sc.nextDouble();

        Epel = k * Math.pow(x,2) / 2;

        System.out.println("O equilibrio do mola e: " + Epel);
    }
}
