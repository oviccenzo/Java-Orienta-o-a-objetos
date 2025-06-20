package Funcoes;

import java.util.Scanner;

public class MultiplicadoPorTres {

    public static void mult(float a, float b, float c){
        System.out.printf("%f",a*b*c);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float x,y;
        x = 23.5f;
        y = 12.5f;
        mult(x , y, 3.87f);

    }
}
