package Funcoes;
import java.util.Scanner;
public class Exercicio5_CalcularQuantidadeDeAnoMeseDia {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int anos , meses, dias, SomaTotalDoAno;

        System.out.print("Calcular a quantidade anos: ");
        anos = sc.nextInt();

        System.out.print("Calcular a quantidade de meses: ");
        meses = sc.nextInt();

        System.out.print("Calcular a quantidade de dias: ");
        dias = sc.nextInt();

        SomaTotalDoAno = (anos * 365) + (meses * 30) + dias;

        System.out.printf("Soma da quantidade de anos e meses e anos e:  %d\n",SomaTotalDoAno);
    }
}
