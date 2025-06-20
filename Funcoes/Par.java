package Funcoes;

import java.util.Scanner;

public class Par {

    public static boolean Par(int a) {
        if (a % 2 == 0) {
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com numero: ");
        int num = sc.nextInt();
        if(Par(num)) {
            System.out.println( "\n\nO numero e par.\n" );
        } else {
            System.out.println( "\n\nO numero e impar\n" );
        }
    }
}
