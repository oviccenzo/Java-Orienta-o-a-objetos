package Funcoes;

public class A {

    static int num;
    public static int func(int a, int b){

        a = (a+b) / 2;
        num -= a;
        return a;
    }

    public static void main(String[] args){

        int primeiro = 0, segundo = 50;

        num = 10;
        num += func(primeiro,segundo);

        System.out.printf("\nConfira! num = %d\t Primeiro = %d\t Segundo = %d",num,primeiro,segundo);
    }
}
