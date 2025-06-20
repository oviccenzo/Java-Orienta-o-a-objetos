package Funcoes;

import java.util.Scanner;

public class Exercicio6ResfazerExercicio5LerQuantidadeDeAno {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int anos, meses, dias, TotalDoAno;

        System.out.print("Digite a quantidade de dia: ");
        anos = sc.nextInt();

        System.out.print("Digite a quantidade de meses: ");
        meses = sc.nextInt();

        System.out.print("Digite a quantidade de dias: ");
        dias = sc.nextInt();

        TotalDoAno = (int) f_amd_dias(anos,meses,dias);

        System.out.printf("O total do ano e: %d\n",TotalDoAno);

        sc.close();
    }

    public static float f_amd_dias(int dias, int meses, int anos){
        return ((anos * 365) + (meses * 30) + dias);
    }
}

