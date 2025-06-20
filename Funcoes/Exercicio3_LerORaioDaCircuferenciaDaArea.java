package Funcoes;

import java.util.Scanner;

public class Exercicio3_LerORaioDaCircuferenciaDaArea {

    static float raio,area,peri, PI = 3.14f; 

    public static void f_leitura(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        raio = sc.nextFloat();
    }

    public static float f_area(){
        area = (float) (PI * raio * raio);
        return area;
    }

    public static float f_peri(){
        peri = (float) (2 * PI * raio);
        return peri;
    }

    public static void f_imprimi(){

        f_leitura();
        f_area();
        f_peri();

        System.out.println("A area do circulo e: " + area);
        System.out.println("O perimetro do circulo e: " + peri);
    }

    public static void main(String[] args){

        f_imprimi();

    }
}
