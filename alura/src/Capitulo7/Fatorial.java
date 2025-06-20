package Capitulo7;

import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int soma = sc.nextInt();


        for(int i = 1; i < 11; i++){
            soma += i;
            System.out.println("Fatorial de " + i + " = " + soma );

        }
    }
}
