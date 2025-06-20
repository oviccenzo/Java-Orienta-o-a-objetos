import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.print( "Digite o primeiro valor: " );
        int primeiroNumero = sc.nextInt();

        System.out.print( "Digite o segundo valor: " );
        int segundoNumero = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int terceiroNumero = sc.nextInt();

        if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
            System.out.print( "O primeiro numero é o menor:  " + primeiroNumero );
        } else if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
            System.out.print( "O segundo numero é o menor:  " + segundoNumero );
        } else{
            System.out.print("O terceiro numero é o menor: " + terceiroNumero);
        }
    }
}