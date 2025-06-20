import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as idade: ");

        int somaIdade = 0;
        int quantidadeIdade = 0;
        int idade;

        idade = sc.nextInt();

        while(idade >= 0){
            somaIdade += idade;
            quantidadeIdade++;

            idade = sc.nextInt();
        }
        if(quantidadeIdade > 0){
            double media = (double) somaIdade/quantidadeIdade;
            System.out.printf("A media da idade é: %.2f%n",media);
        } else{
            System.out.println("Divisão impossivel");
        }
    }
}
