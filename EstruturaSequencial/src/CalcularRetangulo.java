import java.util.Scanner;

public class CalcularRetangulo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Calcular a base do retangulo: ");
        double BaseDoRetangulo = sc.nextDouble();

        System.out.println("Calcular a alturo do retangulo: ");
        double AlturaDoRetangulo = sc.nextDouble();

        double Area = BaseDoRetangulo * AlturaDoRetangulo;
        double Perímetro = 2 * (BaseDoRetangulo + AlturaDoRetangulo);
        double Diagonal = Math.sqrt(BaseDoRetangulo * BaseDoRetangulo + AlturaDoRetangulo * AlturaDoRetangulo);

        System.out.printf("A area é: %.4f%n" , Area);
        System.out.printf("O perímetro é: %.4f%n", Perímetro);
        System.out.printf("A diagonal é: %.4f%n", Diagonal);
    }
}
