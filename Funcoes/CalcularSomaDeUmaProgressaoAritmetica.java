package Funcoes;
import java.util.Scanner;
public class CalcularSomaDeUmaProgressaoAritmetica {

    public static int CalcularPA(int a1 , int n, int r){
        return a1 + (n - 1) * r;
    }

public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a1,n,r,an;

        System.out.print("Calcular o primeiro termo p.a.: ");
        a1 = sc.nextInt();

        System.out.print("Calcular a posição do termo da p.a.: ");
        n = sc.nextInt();

        System.out.print("Calcular a razao da p.a.: ");
        r = sc.nextInt();

        an = CalcularPA(a1,n,r);

        System.out.print("O  " + n  + " ° Primeiro termo da progressao aritmetice e: " + an);

        sc.close();
    }
}
