package src1;

import java.util.Scanner;

public class CalcularDistancia {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a distancia calculada: ");

        int distancia = scanner.nextInt();

        double valor = 4;

        if (0 <= distancia && distancia <= 3){
            valor = valor + (distancia * 0.5);
        }

        if(3 <= distancia && distancia <= 6){
            valor = valor + (distancia * 0.75);
        }

        if (distancia > 6){
            valor = valor + (distancia * 1.50);
        }

        System.out.println("A distancia é: "+distancia);
        System.out.println("O valor da distancia é:  "+valor);
    }
}
