package Funcoes;

public class Soma {


    public static void soma (float a, int b){

        float resultado;

        resultado = a + b;

        System.out.printf("A soma de %f com %d e %1.2f\n",a,b,resultado);
    }

    public static void main(String[] args){
        soma(16.7f,15 );
    }
}
