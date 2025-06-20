import java.util.Locale;
import java.util.Scanner;

public class Experiencia{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos caso de teste serão digitados? ");
        int n = sc.nextInt();

        int totalDeCobaia = 0;
        int totalDeCoelho = 0;
        int totalDeRato = 0;
        int totalDeSapo = 0;

        for(int i = 0; i < n; i++){
            System.out.print("quantidade de cobaia: ");
            int quantidade = sc.nextInt();
            System.out.print("tipo de Cobaia: ");
            char tipo = sc.next().charAt(0);

            if(tipo == 'C'){
                totalDeCoelho = totalDeCoelho + quantidade;
            } else if(tipo == 'R'){
                totalDeRato = totalDeRato + quantidade;
            } else if(tipo == 'S'){
                totalDeSapo = totalDeSapo + quantidade;
            }
            totalDeCobaia = totalDeCobaia + quantidade;
        }
        double percentualDeCoelho = (totalDeCoelho * 100.00) / totalDeCobaia;
        double percentualDeRato = (totalDeRato * 100.00) / totalDeCobaia;
        double percentualDeSapo = (totalDeSapo * 100.00) / totalDeCobaia;

        System.out.printf("Relatorio Final: %n");
        System.out.printf("Total: %d cobaias%n", totalDeCobaia);
        System.out.printf("total de coelhos: %d%n" , totalDeCoelho);
        System.out.printf("total de rato: %d%n" , totalDeRato);
        System.out.printf("Total de sapo: %d%n" , totalDeSapo);
        System.out.printf("Percentual de ceolho: %.2f%%%n" , percentualDeCoelho);
        System.out.printf("Percentual de rato: %.2f%%%n" , percentualDeRato);
        System.out.printf("Percentual de sapo: %.2f%%%n", percentualDeSapo);
    }
}
