package While;
import java.util.Scanner;

public class Exercicio11_DentroFora {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numero voce vai digitar? ");
        int n = sc.nextInt();

        int dentro = 0;
        int fora = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            int x = sc.nextInt();

            if(x >= 10 && x <= 20){
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println("Dentro: " + dentro);
        System.out.println("Fora: " + fora);

    }
}
