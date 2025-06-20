import java.util.Scanner;

public class OperadoraDeTelofonia {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double valor = 50.0;
        int minuto;

        System.out.print("Digite a quantidade de minutos: ");
        minuto = sc.nextInt();

        if(minuto > 100) {
            valor = valor + (minuto - 100) * 2.0;
        }

        System.out.println("Valor a pagar é: R$ " + valor);
    }
}
