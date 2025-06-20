package Funcoes;
import java.util.Scanner;
public class Exercicio10 {

    public static int CalcularHora(int duracaoDoTempo){
        return duracaoDoTempo  / 3600;
    }

    public static int CalcularMinuto(int duracaoDoTempo){
        return (duracaoDoTempo % 3600) / 60;
    }

    public static int CalcularSegundo(int duracaoDoTempo){
        return duracaoDoTempo % 60;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o total de segundo: ");
        int duracao = sc.nextInt();

        int hora = CalcularHora(duracao);
        int minuto = CalcularMinuto(duracao);
        int segundo = CalcularSegundo(duracao);

        System.out.printf("Hora: %d : Minuto: %d : Segundo: %d ",hora, minuto,segundo);


    }
}
