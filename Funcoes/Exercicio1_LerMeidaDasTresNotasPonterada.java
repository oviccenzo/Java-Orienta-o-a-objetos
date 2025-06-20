package Funcoes;

import java.util.Scanner;

public class Exercicio1_LerMeidaDasTresNotasPonterada {

    static float nota1,nota2,nota3,media;

    public static void le_nota(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextFloat();

        sc.close();
    }

    public static void le_media(){

        media = (nota1 * 2 + nota2 * 3 + nota3 * 4) / 9.0f;
    }

    public static void imprimi(){

        System.out.println("O resultado da tres provas e: "+media);
    }

    public static void main(String[] args){

        le_nota();
        le_media();
        imprimi();
    }
}
