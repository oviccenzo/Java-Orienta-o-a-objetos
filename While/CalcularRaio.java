package While;
import java.util.Scanner;
public class CalcularRaio {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double raio = 9;

        while(raio > 0){
            System.out.println("Digite o valor do raio: ");
            raio = sc.nextInt();
            double area = 3.14 * raio * raio;
            System.out.println("O resultado do raio e: " + area);
        }
    }
}
