import java.util.Scanner;

public class SomaImpares{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int x = sc.nextInt();
        System.out.print("digite dois numero: ");
        int y = sc.nextInt();

        int soma = 0;
        if(x > y){
            int contar = x;
            x = y;
            y = contar;
        }

        for(int i = x + 1; i< y;i++){
            if(i % 2 != 0){
                soma += i;

            }
        }
        System.out.print("soma dos ímpares = " + soma);
    }
}
