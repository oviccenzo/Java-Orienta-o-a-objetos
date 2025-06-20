package Funcoes;

import java.util.Scanner;

public class Exercicio4_ReescrevendoExercicioAnterior {

    public static float f_area(float raio){
        return (float) (Math.PI * raio * raio);
    }

    public static float f_peri(float raio){
        return raio = (float) (2 * Math.PI * raio);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float peri, area,raio;

        System.out.printf( "" );
        raio = sc.nextFloat();

        area = f_area(raio);
        peri = f_peri(raio);

        System.out.printf("o calculo da area do raio da circuferencia: %.2f\n",area);
        System.out.printf("o calculo da perimetro da circuferencia: %.2f\n",peri);
    }
}
