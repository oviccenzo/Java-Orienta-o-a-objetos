package Funcoes;
import java.util.Scanner;
public class Exercicio9_LerDuracaoDeSegundo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int DuracaoDeSegundo;

        System.out.print("Digite o total de segundo: ");
        DuracaoDeSegundo = sc.nextInt();

        int hora = DuracaoDeSegundo / 3600;
        int minuto = (DuracaoDeSegundo % 3600) / 60;
        int segundo = DuracaoDeSegundo % 60;

        System.out.printf("Quantidade do tempo e: %d:%02d:%02d\n",hora,minuto,segundo);

        sc.close();
    }
}
