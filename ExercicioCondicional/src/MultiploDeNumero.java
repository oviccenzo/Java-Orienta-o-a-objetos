import java.util.Scanner;

public class MultiploDeNumero{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int y = sc.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");
        int x = sc.nextInt();

        if(y % x == 0 || y % y == 0){
            System.out.print("São multiplos");
        }else{
            System.out.print("Não são multiplos");
        }

        sc.close();
    }
}