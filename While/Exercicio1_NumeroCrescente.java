package While;

import java.util.Scanner;

public class Exercicio1_NumeroCrescente {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x,y;

        while(true){
            System.out.print("Digite um numero x: ");
            x = sc.nextInt();
            System.out.print("Digite um numero y: ");
            y = sc.nextInt();

            if(x == y){
                break;
            }

            if( x<y){
                System.out.println("O numero e crescente");
            } else{
                System.out.println("O numero e decrescente");
            }
        }
    }
}
