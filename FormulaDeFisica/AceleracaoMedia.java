package FormulaDeFisica;

import java.util.Scanner;

public class AceleracaoMedia {
    public static class CalcularConversãoTermometrica {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            System.out.print("Calcular a temperatura kelvin: ");
            double tk = sc.nextDouble();

            System.out.print("Calcular a temperatura celsius: ");
            double tc = sc.nextDouble();

            System.out.print("Calcular a temperatura fahrenheit: ");
            double tf = sc.nextDouble();

            double x = tk / 5;
            double c = tc - 32;
            double z = tf - 273 / 5;

            System.out.println(STR."O resultado da conversão kelvin é: \{x}");
            System.out.println(STR."O resultado da conversão celsius é:\{c}");
            System.out.println(STR."O resultado da conversão fahrenheit é: \{z}");
        }
    }
}
