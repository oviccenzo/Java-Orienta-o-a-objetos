package Funcoes;

import java.util.Scanner;

public class Exercicio2_reescreverOExercicioAnterior {

    public static float f_media(float nota1, float nota2, float nota3){
        return ((nota1 * 2 + nota2 * 3 + nota3 * 4)/9.0f);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float nota1, nota2,nota3,media;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextFloat();
        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextFloat();

        media = f_media(nota1,nota2,nota3);
        System.out.print("Imprimir a media das tres provas: " + media);
    }
}
