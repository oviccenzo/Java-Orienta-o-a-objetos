package Funcoes;

import java.util.Scanner;

public class Exercicio7_LerQuantidadeDeHora {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int hora, minuto,segundo, TotalDeSegundo;

        System.out.print("Digite a quantidade de hora: ");
        hora = sc.nextInt();

        System.out.print("Digite a quantidade de minuto: ");
        minuto = sc.nextInt();

        System.out.print("Digite a quantidade de segundo: ");
        segundo = sc.nextInt();

        TotalDeSegundo = (hora * 3600 ) + (minuto * 60) + segundo;

        System.out.printf("O total de segundo e: %d segundo\n ",TotalDeSegundo);
    }
}
