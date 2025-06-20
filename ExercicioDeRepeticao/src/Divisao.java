import java.util.Scanner;
import java.util.Locale;

public class Divisao {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos voces vai digitar? ");
        double n = sc.nextDouble();

        for(int i = 0; i < n; i++){
            System.out.print("Entre com o numerador: ");
            double numerador = sc.nextDouble();
            System.out.print("Entre com o denominador: ");
            double denominador = sc.nextDouble();

            if(denominador == 0){
                System.out.println("Divisão impossível");
            } else{
                double resultado = (double) numerador/denominador;
                System.out.printf("A divisão é =   %.2f%n",resultado);
            }
        }
    }
}
