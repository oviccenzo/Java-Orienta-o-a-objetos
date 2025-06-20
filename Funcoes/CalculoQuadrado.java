package Funcoes;

import java.util.Scanner;
public class CalculoQuadrado {

    public static void CalculoQuadrado(int num){

        num *= num;

        System.out.printf("O quadrado e %d\n",num);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        CalculoQuadrado(num);
    }
}
