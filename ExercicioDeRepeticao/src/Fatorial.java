import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        System.out.print("Digite o valor natural de N(valor Maximo 15): ");
        int n = sc.nextInt();

        if (n < 0 || n >= 15) {
            System.out.println("valor Invalido.Por favor digite numero entre 1 a 15: ");
        } else {
            int fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println("Fatorial = " + fatorial);
        }
    }
}