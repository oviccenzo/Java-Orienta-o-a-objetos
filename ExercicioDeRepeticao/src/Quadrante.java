import java.util.Locale;
import java.util.Scanner;

public class Quadrante {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        while (true) {
            System.out.print( "Digite o valor do coordenada x: " );
            int x = sc.nextInt();
            System.out.print( "Digite o valor do coordenada y: " );
            int y = sc.nextInt();

            if (x == 0 || y == 0) {
                break;
            }

            if (x > 0 && y > 0) {
                System.out.println( "Quadrante Q1" );
            } else if (x < 0 && y > 0) {
                System.out.println( "Quadrante Q2" );
            } else if (x < 0 && y < 0) {
                System.out.println( "Quadrante Q3" );
            } else if (x > 0 && y < 0) {
                System.out.println( "Quadrante Q4" );
            }
        }
        System.out.println( "Fim do Programa!!" );
        sc.close();
    }
}
