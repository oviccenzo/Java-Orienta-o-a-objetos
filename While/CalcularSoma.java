package While;
import java.util.Scanner;
public class CalcularSoma {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int soma = 0,contador = 1;

        while(contador <= 5){
            System.out.print("Digite " + contador + " numero: ");
            int numero = sc.nextInt();
            soma += numero;
            contador++;
        }

        System.out.println("A soma de cinco numero e: " + soma);

        sc.close();
    }
}
