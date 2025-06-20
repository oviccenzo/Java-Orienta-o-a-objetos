package While;
import java.util.Scanner;
public class ContarNumero {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numero, contador = 0, soma = 0;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        while(contador < 8){
            soma = soma + numero;
            contador = contador + 1;
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
        }

        System.out.println("O resultado da soma e: " + soma);

        sc.close();
    }
}
