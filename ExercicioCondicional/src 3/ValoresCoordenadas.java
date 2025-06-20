import java.util.Locale;
import java.util.Scanner;

public class ValoresCoordenadas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = sc.nextDouble();

        System.out.print("Digite o valor de y: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.print("Origem");
        } else if (x == 0) {
            System.out.print("Eixo x");
        } else if (y == 0) {
            System.out.print("Eixo y");
        } else if (x > 0 && y > 0) {
            System.out.print("Quadrante Q1");
        } else if (x < 0  && y > 0) {
            System.out.print("Quadrante Q2");
        } else if (x < 0 && y < 0) {
            System.out.print("Quadrante Q3");
        } else if (x > 0 && y < 0) {
            System.out.print("Quadrante Q4");
        }
    }
}

