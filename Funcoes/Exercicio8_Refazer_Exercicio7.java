package Funcoes;

import java.util.Scanner;

public class Exercicio8_Refazer_Exercicio7 {

    public static int f_amd_seg(int horas, int minuto, int segundos){
        return ((horas * 3600) + (minuto * 60) + segundos);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int horas, minutos, segundos,TotalDeSegundo;

        System.out.print("Digite a quantidade de hora: ");

        horas = sc.nextInt();

        System.out.print("Digite a quantidade de minuto: ");
        minutos = sc.nextInt();

        System.out.print("Digite a quantidade de segundo: ");
        segundos = sc.nextInt();

        TotalDeSegundo = f_amd_seg(horas,minutos,segundos);

        System.out.printf("O total de segundo e: %d segundo\n",TotalDeSegundo);

        sc.close();
    }
}